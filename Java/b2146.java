import java.io.IOException;
import java.util.Scanner;

public class b2146 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int senha = 0;
        while (senha < 9999) {
            senha = scan.nextInt();
            int senhav = senha - 1;
            System.out.println(senhav);
        }
        scan.close();
    }

}
