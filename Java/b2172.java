import java.io.IOException;
import java.util.Scanner;

public class b2172 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int multi, xp;
        do {
            multi = scan.nextInt();
            xp = scan.nextInt();
            int total = multi * xp;
            if (multi > 0 && xp > 0) {
                System.out.println(total);
            }
        } while (multi != 0 && xp != 0);
        scan.close();
    }
}