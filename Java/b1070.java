import java.io.IOException;
import java.util.Scanner;

public class b1070 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int con = 1;
        while (con <= 6) {
            if (num % 2 != 0) {
                con++;
                System.out.println(num);
            }
            num++;
        }
        scan.close();
    }

}