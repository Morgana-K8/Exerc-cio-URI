

import java.util.Scanner;
public class URI_1020 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdTotalDias = teclado.nextInt();

        int qtdAnos = qtdTotalDias / 365;
        qtdTotalDias = qtdTotalDias % 365;

        int qtdMeses = qtdTotalDias / 30;
        qtdTotalDias = qtdTotalDias % 30;

        int qtdDias = qtdTotalDias;

        System.out.printf("%d ano(s)\n", qtdAnos);
        System.out.printf("%d mes(es)\n", qtdMeses);
        System.out.printf("%d dia(s)\n", qtdDias);

        teclado.close();
    }
}


/* 
400
1 ano(s)
1 mes(es)
5 dias(s)

800
2 ano(s)
2 mes(es)
10 dias(s)

30
0 ano(s)
1 mes(es)
0 dias(s)
*/