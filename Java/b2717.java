import java.io.IOException;

import java.util.Scanner;

public class b2717 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if ((a + b) <= n) {
            System.out.println("Farei hoje!");
        } else {
            System.out.println("Deixa para amanha!");
        }
        scan.close();
    }

}
