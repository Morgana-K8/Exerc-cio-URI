/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/


import java.util.Locale;
import java.util.Scanner;

public class URI_1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double valorInformado = teclado.nextDouble();
        int valor = 0;

        System.out.println("NOTAS:");
        valor = (int) valorInformado / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", valor);
        valorInformado = valorInformado % 100.0;

        valor = (int) valorInformado / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", valor);
        valorInformado = valorInformado % 50.0;

        valor = (int) valorInformado / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", valor);
        valorInformado = valorInformado % 20.0;

        valor = (int) valorInformado / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", valor);
        valorInformado = valorInformado % 10.0;

        valor = (int) valorInformado / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", valor);
        valorInformado = valorInformado % 5.0;

        valor = (int) valorInformado / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", valor);
        valorInformado = valorInformado % 2.0;

        valorInformado = valorInformado * 100.0;

        System.out.println("MOEDAS:");

        valor = (int) valorInformado / 100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", valor);
        valorInformado = valorInformado % 100.0;

        valor = (int) valorInformado / 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", valor);
        valorInformado = valorInformado % 50.0;

        valor = (int) valorInformado / 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", valor);
        valorInformado = valorInformado % 25.0;

        valor = (int) valorInformado / 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", valor);
        valorInformado = valorInformado % 10.0;

        valor = (int) valorInformado / 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", valor);
        valorInformado = valorInformado % 5.0;

        valor = (int) valorInformado / 1;
        System.out.printf("%d moeda(s) de R$ 0.01\n", valor);
        valorInformado = valorInformado % 1.0;

        teclado.close();

    }
    
}
/*
Exemplo de Entrada

576.73

Exemplo de Saída
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

Exemplo de Entrada

4.00

Exemplo de Saída

NOTAS:
0 nota(s) de R$ 100.00
0 nota(s) de R$ 50.00
0 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
2 nota(s) de R$ 2.00
MOEDAS:
0 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
0 moeda(s) de R$ 0.01

Exemplo de Entrada	   

91.01

Exemplo de Saída
NOTAS:
0 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
2 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
1 moeda(s) de R$ 0.01
*/