import java.io.IOException;
import java.util.Scanner;

public class b3040 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            int alt = scan.nextInt();
            int esp = scan.nextInt();
            int gal = scan.nextInt();
            if (alt >= 200 && alt <= 300 && esp >= 50 && gal >= 150) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
        }
        scan.close();
    }

}
