
import java.util.Scanner; 
public class URI_100333 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);

        teclado.close();
    }
}

/* 
30
10
SOMA = 40

-30
10
SOMA = -20

0
0
SOMA = 0
*/