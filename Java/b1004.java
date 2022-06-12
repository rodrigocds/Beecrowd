import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1004 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int X, Y, PROD;
        X = scan.nextInt();
        Y = scan.nextInt();
        PROD = X * Y;
        System.out.println("PROD = "+ PROD);
        scan.close();
    }

}

//3 9
//-30 10
//0 9