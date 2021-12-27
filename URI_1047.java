/* 
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: 
*/

import java.io.IOException; 
import java.util.Scanner;
public class URI_1047 {
    public static void main(String[] args)  throws IOException {
        Scanner teclado = new Scanner(System.in);
        int hInicio = teclado.nextInt();
        int mInicio = teclado.nextInt();
        int hFim = teclado.nextInt();
        int mFim = teclado.nextInt();
        int totalH = hFim - hInicio;
        int totalM = mFim - mInicio;

        if (totalH < 0) {
            totalH = 24 + (hFim - hInicio);
        }
        if (totalM < 0) {
            totalM = 60 + (mFim - mInicio);
            totalH--;
        }
        if (hInicio == hFim && mInicio == mFim) {
        System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else {
        System.out.println("O JOGO DUROU "+ totalH +" HORA(S) E "+ totalM +" MINUTO(S)");
        }

        teclado.close();
    }
}


/* 
7 8 9 10

O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)

7 7 7 7

O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)

7 10 8 9

O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)
*/