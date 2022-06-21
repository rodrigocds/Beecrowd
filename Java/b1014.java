import java.io.IOException;
import java.util.Scanner;

public class b1014 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        double Y = scan.nextDouble();
        double med = X / Y;
        System.out.printf("%.3f km/l%n", med);
        scan.close();
    }

}