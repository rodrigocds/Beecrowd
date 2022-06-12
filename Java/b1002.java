import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1002 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double raio, n, area;
        raio = scan.nextDouble();
        n = 3.14159;
        area = n * raio * raio;
        System.out.format("A=%.4f%n", area);
        scan.close();
    }

}


//2.00
//100.64
//150.00