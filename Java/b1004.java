import java.io.IOException;

public class b1004 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int X, Y, PROD;
        X = scan.nextInt();
        Y = scan.nextInt();
        PROD = X * Y;
        System.out.println("PROD = " + PROD);
        scan.close();
    }

}