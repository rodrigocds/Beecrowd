import java.io.IOException;
import java.util.Scanner;

public class b1094 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int rep = scan.nextInt();
        int coelho = 0, rato = 0, sapo = 0, total = 0;
        for (int i = 1; i <= rep; i++) {
            int qtd = scan.nextInt();
            char tipo = scan.next().charAt(0);
            switch (tipo) {
                case 'C':
                    coelho += qtd;
                    total += qtd;
                    break;

                case 'R':
                    rato += qtd;
                    total += qtd;
                    break;

                case 'S':
                    sapo += qtd;
                    total += qtd;
                    break;
            }
        }

        /*
         * float perco = ((coelho * 100) / total);
         * float perra = ((rato * 100) / total);
         * float persa = ((sapo * 100) / total);
         */

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", ((double) coelho / total) * 100) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ((double) rato / total) * 100) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", ((double) sapo / total) * 100) + " %");

        /*
         * System.out.printf("Percentual de coelhos: %.2f %s \n", perco, "%");
         * System.out.printf("Percentual de ratos: %.2f %s \n", perra, "%");
         * System.out.printf("Percentual de sapos: %.2f %s\n", persa, "%");
         * scan.close();
         */

        scan.close();
    }
}
