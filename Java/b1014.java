import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1014 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        double Y = scan.nextDouble();
        double med = X / Y;
        System.out.printf("%.3f km/l%n", med);
        scan.close();
    }

}

//500 35.0
//2254 124.4
//4554 464.6