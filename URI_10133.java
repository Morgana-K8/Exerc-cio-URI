import java.util.Scanner;

public class URI_10133 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maiorABC + " eh o maior");

        teclado.close();
    } 
}
/*
7
14
106
106 eh o maior
217
14
6
217 eh o maior
*/