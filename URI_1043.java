/* 
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
*/

import java.util.Scanner; 
public class URI_1043 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble(); 

        if ((A < B + C) && (B < A + C) && (C < B + A)) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } 
        else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        teclado.close();
    }
}

/* 
6.0 4.0 2.0
Area = 10.0

6.0 4.0 2.1
Perimetro = 12.1
*/
