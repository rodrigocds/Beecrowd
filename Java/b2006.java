import java.io.IOException;
import java.util.Scanner;

public class b2006 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int cha = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int E = scan.nextInt();
        int total = 0;
        if (A == cha) {
            total++;
        }
        if (B == cha) {
            total++;
        }
        if (C == cha) {
            total++;
        }
        if (D == cha) {
            total++;
        }
        if (E == cha) {
            total++;
        }
        System.out.println(total);
        scan.close();
    }

}
