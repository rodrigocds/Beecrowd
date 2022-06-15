import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
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

//25.01
//25.00
//100.00
//-25.02