import java.io.IOException;
import java.util.Scanner;

public class b1985 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        double p1 = 1.50;
        double p2 = 2.50;
        double p3 = 3.50;
        double p4 = 4.50;
        double p5 = 5.50;
        double valor, valort = 0;
        for (int i = 0; i < qtd; i++) {
            int escolha = scan.nextInt();
            int qtdes = scan.nextInt();
            switch (escolha) {
                case 1001:
                    valor = p1 * qtdes;
                    valort += valor;
                    break;
                case 1002:
                    valor = p2 * qtdes;
                    valort += valor;
                    break;
                case 1003:
                    valor = p3 * qtdes;
                    valort += valor;
                    break;
                case 1004:
                    valor = p4 * qtdes;
                    valort += valor;
                    break;
                case 1005:
                    valor = p5 * qtdes;
                    valort += valor;
                    break;
            }
        }
        System.out.printf("%.2f\n", valort);
        scan.close();
    }

}
