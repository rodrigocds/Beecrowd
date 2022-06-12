import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1005 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double A, B, MEDIA;
        A = scan.nextDouble();
        B = scan.nextDouble();
        MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        scan.close();
    }

}

//5.0 7.1
//0.0 7.1
//10.0 10.0