import java.io.IOException;
import java.util.Scanner;

public class b1067 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i = i + 2) {
            System.out.println(i);
        }
        scan.close();
    }

}