import java.io.IOException;
import java.util.Scanner;

public class b1914 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            String player1 = scan.next();
            String escolha1 = scan.next();
            String player2 = scan.next();
            String escolha2 = scan.next();
            String vencedor = "Ngm";

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int total = num1 + num2;

            if (escolha1.equals("PAR")) {
                if (total % 2 == 0) {
                    vencedor = player1;
                }
            } else if (escolha1.equals("IMPAR")) {
                if (total % 2 != 0) {
                    vencedor = player1;
                }
            }

            if (escolha2.equals("PAR")) {
                if (total % 2 == 0) {
                    vencedor = player2;
                }
            } else if (escolha2.equals("IMPAR")) {
                if (total % 2 != 0) {
                    vencedor = player2;
                }
            }

            System.out.println(vencedor);
        }
        scan.close();
    }
}