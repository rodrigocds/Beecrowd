import java.io.IOException;
import java.util.Scanner;

public class b1065 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int E = scan.nextInt();
        int P = 0;
        if (A % 2 == 0) {
            P++;
        }
        if (B % 2 == 0) {
            P++;
        }
        if (C % 2 == 0) {
            P++;
        }
        if (D % 2 == 0) {
            P++;
        }
        if (E % 2 == 0) {
            P++;
        }
        System.out.println(P + " valores pares");
        scan.close();
    }

}