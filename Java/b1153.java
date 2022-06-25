import java.io.IOException;
import java.util.Scanner;

public class b1153 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat *= i;
        }
        System.out.println(fat);
        scan.close();
    }

}