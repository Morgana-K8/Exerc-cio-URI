import java.util.Locale;
import java.util.Scanner;
public class URI_10177 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int qtdHoras = input.nextInt();
        int velocidadeMediaHora = input.nextInt();

        int qtdKilometros = qtdHoras * velocidadeMediaHora;

        double qtdLitrosGastos = qtdKilometros / 12.0;

        System.out.printf("%.3f\n", qtdLitrosGastos);

        input.close();

    }
}
/*
10
85
70.833
2
92
15.333

22
67
122.833
*/