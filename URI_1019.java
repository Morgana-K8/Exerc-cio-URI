/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/
import java.util.Scanner;

public class URI_1019 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int totalSegundos = teclado.nextInt();

		int qtdHoras = totalSegundos / 3600;
		totalSegundos = totalSegundos % 3600;

		int qtdMinutos = totalSegundos / 60;
		totalSegundos = totalSegundos % 60;

		int qtdSegundos = totalSegundos;

		System.out.println(qtdHoras + ":" + qtdMinutos + ":" + qtdSegundos);//concatenação dos valores
		//System.out.printf("%d:%d:%d\n", qtdHoras, qtdMinutos, qtdSegundos);//essa é mais uma forma de espressar o mesmo exemplo de cima(string formatada)
		//System.out.println("%.2f");//usa para imprimir uma variavel do tipo double
		//System.out.println("%d");//usa para imprimir variavel do tipo int
		

		teclado.close();

    }

}

/*
Exemplo de Entrada	
556
Exemplo de Saída
0:9:16

1

0:0:1

140153

38:55:53
*/
