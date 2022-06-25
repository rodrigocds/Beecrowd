import java.io.IOException;
import java.util.Scanner;

public class b1933 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
        scan.close();
    }
}