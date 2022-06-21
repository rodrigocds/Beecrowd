import java.io.IOException;
import java.util.Scanner;

public class b1011 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double PI = 3.14159;
        double res = (4 / 3.0) * PI * (Math.pow(raio, 3));
        System.out.printf("VOLUME = %.3f\n", res);
        scan.close();

    }

}