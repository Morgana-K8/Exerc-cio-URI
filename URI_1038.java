/* 
Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/

import java.io.IOException;
import java.util.Scanner;
public class URI_1038 {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int ID, COUNT;

        ID = teclado.nextInt();
        COUNT = teclado.nextInt();

        if (ID == 1) {
            System.out.printf("Total: R$ %.2f\n", COUNT * 4.00);
        }
        if (ID == 2) {
            System.out.printf("Total: R$ %.2f\n", COUNT * 4.50);
        }
        if (ID == 3) {
            System.out.printf("Total: R$ %.2f\n", COUNT * 5.00);
        }
        if (ID == 4) {
            System.out.printf("Total: R$ %.2f\n", COUNT * 2.00);
        }
        if (ID == 5) {
            System.out.printf("Total: R$ %.2f\n", COUNT * 1.50);
        }


        teclado.close();
    }

}

/* 
3 2
Total: R$ 10.00

4 3
Total: R$ 6.00

2 3
Total: R$ 13.50
*/




/* 
import java.io.IOException;
import java.util.Scanner;

public class URI 1038 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int codigo = leitor.nextInt();
		int quantia = leitor.nextInt();
		double total;
		switch (codigo) {
			case 1:	total = quantia * 4.00; break;
			case 2: total = quantia * 4.50; break;
			case 3: total = quantia * 5.00; break;
			case 4: total = quantia * 2.00; break;
			case 5: total = quantia * 1.50; break;
			default: total = 0;
		}
		System.out.println(String.format("Total: R$ %.2f", total));
	}
	
}
*/


/* 
import  java.util.Scanner ;

public  class  URI_1038 {

	public  static  void  main ( String [] args ) {
		int  X , Y ;
		preço flutuante =  0 ;
		
		Entrada do scanner =  novo  scanner ( sistema . In);
		X  = entrada . nextInt ();
		Y  = entrada . nextInt ();
		if ( X  ==  1 ) {
			preço   = ( flutuação ) ( 4,00  *  Y );
		} else  if ( X  ==  2 ) {
			preço   = ( flutuação ) ( 4,50  *  Y );
		} else  if ( X  ==  3 ) {
			preço   = ( flutuação ) ( 5,00  *  Y );
		} else  if ( X  ==  4 ) {
			preço   = ( flutuação ) ( 2,00  *  Y );
		} else  if ( X  ==  5 ) {
			preço   = ( flutuação ) ( 1,50  *  Y );
		}
		
		Sistema . para fora . printf ( " Total: R $% .2f \ n " , preço);
	}

}
*/
