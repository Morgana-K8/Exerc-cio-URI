/*
 QUESTÃO
 A fórmula para calcular a área de uma circunferência é://double area = pi * Math.pow(raio, 2);
 Considerando para este problema que //double pi = 3.14159;
 - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por pi.
 */

import java.util.Locale;
import java.util.Scanner; 

public class URI_1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double pi = 3.14159;
        double raio = teclado.nextDouble();
        double area = pi * Math.pow(raio, 2);
        System.out.printf("A=%.4f\n",area);

        teclado.close();
    }
    
}
/*
2.00
A = 12.5664

100.64

A = 31819.3103

150.00

A = 70685.7750
*/