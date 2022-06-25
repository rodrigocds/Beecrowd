import java.io.IOException;
import java.util.Scanner;

public class b2936 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int curupira = scan.nextInt();
        total += curupira * 300;
        int boitata = scan.nextInt();
        total += boitata * 1500;
        int boto = scan.nextInt();
        total += boto * 600;
        int mapinguari = scan.nextInt();
        total += mapinguari * 1000;
        int lara = scan.nextInt();
        total += lara * 150;
        System.out.println(total + 225);
        scan.close();

    }

}