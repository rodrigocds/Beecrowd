import java.io.IOException;

public class b1005 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double A, B, MEDIA;
        A = scan.nextDouble();
        B = scan.nextDouble();
        MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        scan.close();
    }

}