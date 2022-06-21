import java.io.IOException;
import java.util.Scanner;

public class b1074 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 0; i < qtd; i++) {
            int X = scan.nextInt();
            if (X == 0) {
                System.out.println("NULL");
            }
            if (X % 2 == 0 && X != 0) {
                System.out.print("EVEN");
            }
            if (X % 2 != 0) {
                System.out.print("ODD");
            }
            if (X > 0) {
                System.out.println(" POSITIVE");
            }
            if (X < 0) {
                System.out.println(" NEGATIVE");
            }
        }
        scan.close();
    }
}
