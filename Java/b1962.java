import java.io.IOException;
import java.util.Scanner;

public class b1962 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        int res;
        for (int i = 0; i < qtd; i++) {
            int num = scan.nextInt();
            if (num >= 2015) {
                res = (num - 2015) + 1;
                System.out.println(res + " A.C.");
            } else {
                res = (2015 - num);
                System.out.println(res + " D.C.");
            }
        }
        scan.close();
    }

}
