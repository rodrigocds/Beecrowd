import java.io.IOException;
import java.util.Scanner;

public class b1197 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int res = ((num1 * num2) * 2);
            System.out.println(res);
        }
        scan.close();
    }

}
