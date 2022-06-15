import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1017 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int hora = scan.nextInt();
        int velo = scan.nextInt();
        int dist = velo * hora;
        double litro = dist / 12.0;
        System.out.printf("%.3f%n", litro);
        scan.close();
    }

}

//10 85
//2 92
//22 67