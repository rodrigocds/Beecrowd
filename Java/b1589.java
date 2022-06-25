import java.io.IOException;
import java.util.Scanner;

public class b1589 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            int r1 = scan.nextInt();
            int r2 = scan.nextInt();
            System.out.println(r1 + r2);
        }
        scan.close();
    }
}
