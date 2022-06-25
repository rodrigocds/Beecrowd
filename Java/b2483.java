import java.io.IOException;
import java.util.Scanner;

public class b2483 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        String a = "a";
        for (int i = 1; i < qtd; i++) {
            a += "a";
        }
        System.out.printf("Feliz nat%sl!\n", a);
        scan.close();
    }

}
