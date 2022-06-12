import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1007 {

    public static void main(String[] args) throws IOException {

    java.util.Scanner scan = new java.util.Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
        scan.close();
    }

}

//5 6 7 8
//0 0 7 8
//5 6 -7 8