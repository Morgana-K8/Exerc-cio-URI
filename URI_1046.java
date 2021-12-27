import java.io.IOException;
import java.util.Scanner;
public class URI_1046 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
		
        int hInicial = teclado.nextInt();
        int hFinal = teclado.nextInt();

    if (hInicial > hFinal) { 
	    System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
    }
    else if (hFinal > hInicial) {
	    System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
    }
    else {
	    System.out.println("O JOGO DUROU 24 HORA(S)");
    }

        teclado.close();

    }
    
}

/* 
16 2
O JOGO DUROU 10 HORA(S)
0 0
O JOGO DUROU 24 HORA(S)
2 16
O JOGO DUROU 14 HORA(S)
*/