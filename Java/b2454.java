import java.io.IOException;
import java.util.Scanner;

public class b2454 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int r = scan.nextInt();
        String res = "";
        if (p == 1 && r == 0) {
            res = "B";
        } else if (p == 0 && r == 0) {
            res = "C";
        } else if (p == 0 && r == 1) {
            res = "C";
        } else if (p == 1 && r == 1) {
            res = "A";
        }
        System.out.println(res);
        scan.close();
    }

}