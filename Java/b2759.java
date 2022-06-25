import java.io.IOException;

import java.util.Scanner;

public class b2759 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();

        System.out.println("A = " + a + ", B = " + b + ", C = " + c);
        System.out.println("A = " + b + ", B = " + c + ", C = " + a);
        System.out.println("A = " + c + ", B = " + a + ", C = " + b);

        scan.close();
    }

}
