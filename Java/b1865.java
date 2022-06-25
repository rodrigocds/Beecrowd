import java.io.IOException;
import java.util.Scanner;

public class b1865 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            String heroi = scan.next();
            int forca = scan.nextInt();
            if (heroi.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        scan.close();
    }

}
