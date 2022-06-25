import java.io.IOException;
import java.util.Scanner;

public class b2221 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 0; i < qtd; i++) {
            int bonus = scan.nextInt();

            int atadab = scan.nextInt();
            int defdab = scan.nextInt();
            int lvldab = scan.nextInt();

            int atagua = scan.nextInt();
            int defgua = scan.nextInt();
            int lvlgua = scan.nextInt();

            int goldab = (atadab + defdab) / 2;
            int golgua = (atagua + defgua) / 2;

            if (lvldab % 2 == 0) {
                goldab = ((atadab + defdab) / 2) + bonus;
            }
            if (lvlgua % 2 == 0) {
                golgua = ((atagua + defgua) / 2) + bonus;
            }
            if (goldab > golgua) {
                System.out.println("Dabriel");
            }
            if (goldab < golgua) {
                System.out.println("Guarte");
            }
            if (goldab == golgua) {
                System.out.println("Empate");
            }
        }
        scan.close();
    }

}
