import java.io.IOException;
import java.util.Scanner;

public class b2374 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int dif = a - b;
        System.out.println(dif);
        scan.close();
    }

}
