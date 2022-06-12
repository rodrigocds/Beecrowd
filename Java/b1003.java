import java.io.IOException;
    
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

public class b1003 {
    
    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a, b, x;
        a = scan.nextInt();
        b = scan.nextInt();
        x = a + b;
        System.out.println("SOMA = " + x);
        scan.close();
    }
    
}

//30 10
//-30 10
//0 0