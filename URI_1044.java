/* 
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
*/
import java.util.Scanner;

public class URI_1044 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } 
        else {
            System.out.println("Nao sao Multiplos");
        }

        teclado.close();
    }

}

/* 
6 24
Sao Multiplos

6 25
Nao sao Multiplos
*/






/* 
import  java.io.IOException ;
import  java.util.Scanner ;

public  class  URI 1044 {
    
    public  static  void  main ( String [] args ) throws  IOException {
        Scanner leitor =  novo  Scanner ( Sistema . In );
        int a = leitor . nextInt ();
        int b = leitor . nextInt ();
        if (a % b ==  0  || b % a ==  0 ) {
            Sistema . para fora . println ( " São Multiplos " );
        } else {
            Sistema . para fora . println ( " Nao sao Multiplos " );
        }
    }
    
}
*/