import java.io.IOException;
import java.util.Scanner;

public class b1017 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int hora = scan.nextInt();
        int velo = scan.nextInt();
        int dist = velo * hora;
        double litro = dist / 12.0;
        System.out.printf("%.3f%n", litro);
        scan.close();
    }

}