import java.io.IOException;
import java.util.Scanner;

public class b2147 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            String galopeira = scan.next();
            float num = (0.01f * galopeira.length());
            System.out.println(String.format("%.2f", num));
        }
        scan.close();
    }
}
