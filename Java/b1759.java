import java.io.IOException;
import java.util.Scanner;

public class b1759 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i < qtd; i++) {
            System.out.print("Ho ");
        }
        System.out.println("Ho!");
        scan.close();
    }
}
