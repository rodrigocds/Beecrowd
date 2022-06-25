import java.io.IOException;
import java.util.Scanner;

public class b2949 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        int A = 0, M = 0, H = 0, E = 0, X = 0;
        for (int i = 0; i < qtd; i++) {
            String nome = scan.next();
            String tipo = scan.next();
            if (tipo.equals("A")) {
                A++;
            }
            if (tipo.equals("E")) {
                E++;
            }
            if (tipo.equals("H")) {
                H++;
            }
            if (tipo.equals("M")) {
                M++;
            }
            if (tipo.equals("X")) {
                X++;
            }
        }
        System.out.println(X + " Hobbit(s)");
        System.out.println(H + " Humano(s)");
        System.out.println(E + " Elfo(s)");
        System.out.println(A + " Anao(s)");
        System.out.println(M + " Mago(s)");

        scan.close();
    }

}