import java.io.IOException;
import java.util.Scanner;

public class b2780 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        if (d <= 800) {
            System.out.println("1");
        }
        if (d >= 801 && d <= 1400) {
            System.out.println("2");
        }
        if (d >= 1401 && d <= 2000) {
            System.out.println("3");
        }
        scan.close();
    }

}