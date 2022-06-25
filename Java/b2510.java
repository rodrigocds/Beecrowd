import java.io.IOException;
import java.util.Scanner;

public class b2510 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            String vilao = scan.next();
            if (vilao.equals("Batmain")) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }
        }
        scan.close();
    }

}