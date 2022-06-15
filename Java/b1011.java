import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1011 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double PI = 3.14159;
        double res = (4/3.0) * PI * (Math.pow(raio, 3));
        System.out.printf("VOLUME = %.3f\n", res);
        scan.close();

    }

}

//3
//15
//1523