import java.io.IOException;
import java.util.Scanner;

public class b1143 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            int quadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);
            System.out.println(i + " " + quadrado + " " + cubo);
        }
        scan.close();
    }

}
