import java.io.IOException;

public class b1001 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int A, B, X;
        A = scan.nextInt();
        B = scan.nextInt();
        X = A + B;
        System.out.println("X = " + X);
        scan.close();
    }
}