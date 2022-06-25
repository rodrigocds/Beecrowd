import java.io.IOException;
import java.util.Scanner;

public class b1146 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num != 0) {
            for (int i = 1; i <= num; i++) {
                if (i < num) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + "\n");
                }
            }
            num = scan.nextInt();
        }
        scan.close();
    }
}
