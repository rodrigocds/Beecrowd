import java.io.IOException;
import java.util.Scanner;

public class b1930 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        int t3 = scan.nextInt();
        int t4 = scan.nextInt();
        int total = ((t1 + t2 + t3 + t4) - 3);
        System.out.println(total);
        scan.close();
    }
}