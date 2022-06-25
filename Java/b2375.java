import java.io.IOException;
import java.util.Scanner;

public class b2375 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        int alt = scan.nextInt();
        int lar = scan.nextInt();
        int pro = scan.nextInt();

        if (dia <= alt && dia <= lar && dia <= pro) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        scan.close();
    }

}
