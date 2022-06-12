import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1006 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double A, B, C, MEDIA;
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10.0;
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        scan.close();
    }

}

//5.0 6.0 7.0
//5.0 10.0 10.0
//10.0 10.0 5.0