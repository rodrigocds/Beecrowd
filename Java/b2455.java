import java.io.IOException;
import java.util.Scanner;

public class b2455 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int p1 = scan.nextInt();
        int c1 = scan.nextInt();
        int p2 = scan.nextInt();
        int c2 = scan.nextInt();

        int pc1 = p1 * c1;
        int pc2 = p2 * c2;

        if (pc1 == pc2) {
            System.out.println("0");
        } else if (pc1 > pc2) {
            System.out.println("-1");
        } else {
            System.out.println("1");
        }
        scan.close();
    }
}
