import java.io.IOException;
import java.util.Scanner;

public class b1099 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 0; i < qtd; i++) {
            int soma = 0;
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (y > x) {
                for (int j = x + 1; j < y; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            } else {
                for (int j = y + 1; j < x; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            }
            System.out.println(soma);
        }
        scan.close();
    }
}
