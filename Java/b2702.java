import java.io.IOException;
import java.util.Scanner;

public class b2702 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int falta = 0;
        int p1 = scan.nextInt();
        int p2 = scan.nextInt();
        int p3 = scan.nextInt();
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        int c3 = scan.nextInt();

        if (c1 > p1) {
            falta += c1 - p1;
        }

        if (c2 > p2) {
            falta += c2 - p2;
        }

        if (c3 > p3) {
            falta += c3 - p3;
        }

        System.out.println(falta);
        scan.close();
    }
}
