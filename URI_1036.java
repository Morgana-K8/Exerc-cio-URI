/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
Entrada
Leia três valores de ponto flutuante (double) A, B e C.
Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
*/
import java.util.Scanner; 
import java.io.IOException;
public class URI_1036 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        double A,B,C,DELTA;

      A = teclado.nextDouble();
      B = teclado.nextDouble();
      C = teclado.nextDouble();

      DELTA = Math.pow(B,2) - (4 * A * C);

      if ((A==0) || (DELTA < 0)) {
        System.out.println("Impossivel calcular");
      }
      else {
        double R1 = (((-1 * B) + Math.pow(DELTA, 0.5)) / (2*A));
        double R2 = (((-1 * B) - Math.pow(DELTA, 0.5)) / (2*A));
        System.out.printf("R1 = %.5f\n",R1);
        System.out.printf("R2 = %.5f\n",R2);
      }
    
        teclado.close();
    }
}

/* 
10.0 20.1 5.1
R1 = -0.29788
R2 = -1.71212

0.0 20.0 5.0
Impossivel calcular

10.3 203.0 5.0
R1 = -0.02466 
R2 = -19.68408

10.0 3.0 5.0
Impossivel calcular
*/