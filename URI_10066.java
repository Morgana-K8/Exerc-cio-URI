import java.util.Locale;
import java.util.Scanner;

public class URI_10066 {
    public static void main(String[] args) {
        //a gente só consegue usar o ponto se nosso sistema operacional estiver localizado nos estados unidos no caso em ingles, no nosso caso nosso sistema operacional está em portugues, e no brasil a gente usa virgula ao inves do ponto, para o sistem deixar a gente usar o ponto, a gente precisa staciar "Locale.setDefault(Locale.US);para mudar isso a gente muda a localidade do sistema.
        Locale.setDefault(Locale.US);//agora pode usar o ponto
        Scanner teclado = new Scanner(System.in);

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        double MEDIA = (A * 2 + B * 3 + C * 5) / 10.0;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        teclado.close();

    }
} 
 /*
 5.0
 6.0
 7.0
 MEDIA = 6.3
 5.0
 10.0
 10.0
 MEDIA = 9.0
 10.0
 10.0
 5.0
 MEDIA = 7.5
 */   

        