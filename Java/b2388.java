import java.io.IOException;
import java.util.Scanner;

public class b2388 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int qtd = scan.nextInt();
        for (int i = 0; i < qtd; i++) {
            int tempo = scan.nextInt();
            int velocidade = scan.nextInt();
            soma += (tempo * velocidade);
        }
        System.out.println(soma);
        scan.close();
    }
}
