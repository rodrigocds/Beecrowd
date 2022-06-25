import java.io.IOException;
import java.util.Scanner;

public class b2339 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int comp = scan.nextInt();
        int pap = scan.nextInt();
        int compap = scan.nextInt();
        if ((comp * compap) > pap) {
            System.out.println("N");
        } else {
            System.out.println("S");
        }
        scan.close();
    }

}
