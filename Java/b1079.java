import java.io.IOException;
import java.util.Scanner;

public class b1079 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double A = 0, B = 0, C = 0;
        for (int i = 0; i < num; i++) {
            A = scan.nextDouble();
            B = scan.nextDouble();
            C = scan.nextDouble();
            double res = ((A * 2) + (B * 3) + (C * 5)) / 10;
            System.out.printf("%.1f\n", res);
        }
        scan.close();
    }

}
