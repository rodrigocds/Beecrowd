import java.io.IOException;
import java.util.Scanner;

public class b1064 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;

        for (int i = 0; i < 6; i++) {
            x = scan.nextDouble();
            if (x > 0) {
                cont++;
                media += x;
            }
        }

        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
        scan.close();
    }

}
