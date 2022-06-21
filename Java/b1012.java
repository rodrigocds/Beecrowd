import java.io.IOException;
import java.util.Scanner;

public class b1012 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double trir = (A * C) / 2;
        double pi = 3.14159;
        double circr = pi * Math.pow(C, 2);
        double trap = ((A + B) * C) / 2;
        double quad = Math.pow(B, 2);
        double ret = A * B;
        System.out.printf("TRIANGULO: %.3f\n", trir);
        System.out.printf("CIRCULO: %.3f\n", circr);
        System.out.printf("TRAPEZIO: %.3f\n", trap);
        System.out.printf("QUADRADO: %.3f\n", quad);
        System.out.printf("RETANGULO: %.3f\n", ret);
        scan.close();
    }

}