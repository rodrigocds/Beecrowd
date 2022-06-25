import java.io.IOException;
import java.util.Scanner;

public class b2679 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            num += 2;
        } else {
            num++;
        }
        System.out.println(num);
        scan.close();
    }
}
