import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1035 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int A = scan.nextInt ();
        int B = scan.nextInt ();
        int C = scan.nextInt ();
        int D = scan.nextInt ();
        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        scan.close();
    }
}

//5 6 7 8
//2 3 2 6