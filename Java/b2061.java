import java.io.IOException;
import java.util.Scanner;

public class b2061 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int aba = scan.nextInt();
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            String acao = scan.next();
            if (acao.equals("clicou")) {
                aba--;
            } else if (acao.equals("fechou")) {
                aba++;
            }
        }
        System.out.println(aba);
        scan.close();
    }

}
