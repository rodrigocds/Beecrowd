import java.io.IOException;
import java.util.Scanner;

public class b1564 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int reclamacao = scan.nextInt();
            if (reclamacao == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }
        scan.close();
    }

}
