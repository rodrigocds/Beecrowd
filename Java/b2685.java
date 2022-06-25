import java.io.IOException;
import java.util.Scanner;

public class b2685 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            if (num >= 0 && num < 90 || num == 360) {
                System.out.println("Bom Dia!!");
            } else if (num >= 90 && num < 180) {
                System.out.println("Boa Tarde!!");
            } else if (num >= 180 && num < 270) {
                System.out.println("Boa Noite!!");
            } else if (num >= 270 && num < 360) {
                System.out.println("De Madrugada!!");
            }
        }
        scan.close();
    }
}
