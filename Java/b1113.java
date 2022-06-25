import java.io.IOException;
import java.util.Scanner;

public class b1113 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        while (x > y || y > x) {
            if (x > y) {
                System.out.println("Decrescente");
            }
            if (x < y) {
                System.out.println("Crescente");
            }
            x = scan.nextInt();
            y = scan.nextInt();
        }
        scan.close();
    }

}
