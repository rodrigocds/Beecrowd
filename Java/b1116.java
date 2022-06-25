import java.io.IOException;
import java.util.Scanner;

public class b1116 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 0; i < qtd; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double res = x / y;
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(res);
            }
        }
        scan.close();
    }

}