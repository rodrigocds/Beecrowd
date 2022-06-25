import java.io.IOException;
import java.util.Scanner;

public class b1133 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int troca = 0;
        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }
        for (int i = x + 1; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
        scan.close();
    }

}