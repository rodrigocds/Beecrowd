import java.io.IOException;
import java.util.Scanner;

public class b1943 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int pos = scan.nextInt();
        if (pos == 1) {
            System.out.println("Top 1");
        } else if (pos >= 2 && pos <= 3) {
            System.out.println("Top 3");
        } else if (pos >= 4 && pos <= 5) {
            System.out.println("Top 5");
        } else if (pos >= 6 && pos <= 10) {
            System.out.println("Top 10");
        } else if (pos >= 11 && pos <= 25) {
            System.out.println("Top 25");
        } else if (pos >= 26 && pos <= 50) {
            System.out.println("Top 50");
        } else if (pos >= 51 && pos <= 100) {
            System.out.println("Top 100");
        }
        scan.close();
    }

}
