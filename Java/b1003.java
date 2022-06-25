import java.io.IOException;

public class b1003 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a, b, x;
        a = scan.nextInt();
        b = scan.nextInt();
        x = a + b;
        System.out.println("SOMA = " + x);
        scan.close();
    }

}