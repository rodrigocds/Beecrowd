import java.io.IOException;
import java.util.Scanner;

public class b3091 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a % b;
        System.out.println(res);
        scan.close();
    }

}