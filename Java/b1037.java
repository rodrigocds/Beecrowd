import java.io.IOException;

public class b1037 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        float numero = scan.nextFloat();

        if (numero < 0 || numero > 100) {
            System.out.println("Fora de intervalo");
        }

        else if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        }

        else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        }

        else if (numero > 50 && numero <= 25) {
            System.out.println("Intervalo (50,75]");
        }

        else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        }
        scan.close();
    }
}