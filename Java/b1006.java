import java.io.IOException;

public class b1006 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double A, B, C, MEDIA;
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10.0;
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        scan.close();
    }

}