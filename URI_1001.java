/*
Leia 2 valores inteiros e armazene-os nas variaveis A e B
*/

import  java.io.IOException ;
import  java.util.Scanner ;
public  class  URI_1001 {	
    public  static  void  main(String[] args ) throws  IOException {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int x = a + b;
        System.out.println("X = "  + x);

        teclado.close();
    }
	
}

/*
10
9
X = 19
-10
4
X = -6

15
-7

X = 8
*/
