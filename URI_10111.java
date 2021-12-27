import java.util.Locale;
import java.util.Scanner;

public class URI_10111 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double PI = 3.14159;
        double raio = teclado.nextDouble();
        double volumeEsfera = (4/3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volumeEsfera);

        teclado.close();
    }
  
}
/*
3
VOLUME = 113.097
15
VOLUME = 14237.155
1523
VOLUME = 14797486501.627
*/
