/*
QUESTÃO
 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
 diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
 DIFERENCA = (A * B - C * D).
 ENTRADA
 O arquivo de entrada contém 4 valores inteiros.
 SAÍDA
 Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme 
 exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
*/

import java.util.Scanner; 

public class URI_1007 { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        int DIFERENCA = (A * B - C * D);

        System.out.printf("DIFERENCA = " + DIFERENCA);

        teclado.close();
    }

}
/*
Exemplos de Entrada	
5
6
7
8

Exemplos de Saída
DIFERENCA = -26

0
0
7
8

DIFERENCA = -56

5
6
-7
8

DIFERENCA = 86
*/