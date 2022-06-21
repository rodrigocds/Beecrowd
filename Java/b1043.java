import java.io.IOException;
import java.util.Scanner;

public class b1043 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        if (A < B + C && B < C + A && C < B + A) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        if (A >= B + C || B >= C + A || C >= A + B) {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
        scan.close();
    }

}