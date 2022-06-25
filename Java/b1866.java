import java.io.IOException;
import java.util.Scanner;

public class b1866 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 0; i < qtd; i++) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        scan.close();
    }
}
