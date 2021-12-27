/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia =

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
*/

import java.util.Locale;
import java.util.Scanner;

public class URI_1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double distanciaXY = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distanciaXY);

        teclado.close();

    }
}
/*
Exemplo de Entrada	
1.0 7.0
5.0 9.0
Exemplo de Saída
4.4721

-2.5 0.4
12.1 7.3

16.1484

2.5 -0.4
-12.2 7.0

16.4575
*/