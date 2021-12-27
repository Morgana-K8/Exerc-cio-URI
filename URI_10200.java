import java.util.Scanner;
public class URI_10200 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtdTotalDias = teclado.nextInt();

        int qtdAnos = qtdTotalDias /365;
        qtdTotalDias = qtdTotalDias % 365;
        int qtdMeses = qtdTotalDias /30;
        qtdTotalDias = qtdTotalDias % 30;
        int qtdDias = qtdTotalDias;

        System.out.printf("%d ano(s)\n", qtdAnos);
        System.out.printf("%d mes(es)\n", qtdMeses);
        System.out.printf("%d dia(s)\n", qtdDias);

        teclado.close();
    }
}
/*
12154
33 ano(s)
3 mes(es)
19 dia(s)
15468
42 ano(s)
4 mes(es)
18 dia(s)
*/
