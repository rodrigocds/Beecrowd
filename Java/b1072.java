import java.io.IOException;
import java.util.Scanner;

public class b1072 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        int in = 0, out = 0;
        for (int con = 0; con < qtd; con++) {
            int num = scan.nextInt();
            if (num >= 10 && num <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        scan.close();
    }

}