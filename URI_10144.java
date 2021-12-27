import java.util.Locale;
import java.util.Scanner;

public class URI_10144 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int distanciaPercorrida = teclado.nextInt();
        double qtdCombustivel = teclado.nextDouble();

        double mediaCombustivelGasto = distanciaPercorrida / qtdCombustivel;

        System.out.printf("%.3f km/l\n", mediaCombustivelGasto);

        teclado.close();

    }
}

/*
500
35.0
14.286 km/l
*/   