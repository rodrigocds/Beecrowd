import java.io.IOException;
import java.util.Scanner;

public class b2862 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            int poder = scan.nextInt();
            if (poder > 8000) {
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
        scan.close();
    }

}