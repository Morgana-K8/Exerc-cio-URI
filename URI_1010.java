/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
*/
/*
//import java.text.DecimalFormat;
import  java.util.Locale;
import  java.util.Scanner ;

public class URI_1010 { 
	public static void main(String [] args) {
		//DecimalFormat df_3 = new DecimalFormat("0.000");
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		

        int codPeca1 = teclado.nextInt();
		int qtdPeca1 = teclado.nextInt();
		double valorPeca1 = teclado.nextDouble();
		int codPeca2 = teclado.nextInt();
		int qtdPeca2 = teclado.nextInt();
		double valorPeca2 = teclado.nextDouble();

		double custoTotal = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", custoTotal);

        teclado.close();
  
	}
}
*/

/*

12 1 5.30
16 2 5.10
VALOR A PAGAR: R$ 15.50

13 2 15.30
161 4 5.20

VALOR A PAGAR: R$ 51.40

1 1 15.10
2 1 15.10

VALOR A PAGAR: R$ 30.20
*/




