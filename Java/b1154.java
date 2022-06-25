import java.io.IOException;
import java.util.Scanner;

public class b1154 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float idade = 0, qtd = 0, soma = 0;
        while (idade >= 0) {
            idade = scan.nextInt();
            if (idade >= 0) {
                soma += idade;
                qtd++;
            }
        }
        float media = soma / qtd;
        System.out.printf("%.2f\n", media);
        scan.close();
    }
}