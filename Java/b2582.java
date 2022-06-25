import java.io.IOException;
import java.util.Scanner;

public class b2582 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 0; i < qtd; i++) {
            int bot1 = scan.nextInt();
            int bot2 = scan.nextInt();
            int soma = bot1 + bot2;
            if (soma == 0) {
                System.out.println("PROXYCITY");
            }
            if (soma == 1) {
                System.out.println("P.Y.N.G.");
            }
            if (soma == 2) {
                System.out.println("DNSUEY!");
            }
            if (soma == 3) {
                System.out.println("SERVERS");
            }
            if (soma == 4) {
                System.out.println("HOST!");
            }
            if (soma == 5) {
                System.out.println("CRIPTONIZE");
            }
            if (soma == 6) {
                System.out.println("OFFLINE DAY");
            }
            if (soma == 7) {
                System.out.println("SALT");
            }
            if (soma == 8) {
                System.out.println("ANSWER!");
            }
            if (soma == 9) {
                System.out.println("RAR?");
            }
            if (soma == 10) {
                System.out.println("WIFI ANTENNAS");
            }
        }
        scan.close();
    }

}
