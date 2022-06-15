import java.io.IOException;
import java.util.Scanner;

public class b1022 {
    public static void simp(int n, int d) {
        if(n > d) {
            for(int i = n / 2; i > 0; i--) {
                if(n % i == 0 && d % i == 0) {
                    System.out.println(n / i + "/" + d / i);
                    break;
                }
            }
        } else if (n < d) {
            for(int i = d / 2; i > 0; i--) {
                if(n % i == 0 && d % i == 0) {
                    System.out.println(n / i + "/" + d / i);
                    break;
                }
            }
        } else {
            System.out.println(1 + "/" + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        int nt = 0, dt = 0;
        for (int i = 1; i <= qtd; i++) {
            int n1 = scan.nextInt();
            char barra1 = scan.next().charAt(0);
            int d1 = scan.nextInt();
            char operador = scan.next().charAt(0);
            int n2 = scan.nextInt();
            char barra2 = scan.next().charAt(0);
            int d2 = scan.nextInt();
            if (operador == '+') {
                nt = (n1 * d2 + n2 * d1);
                dt = (d1 * d2);
            } else if (operador == '-') {
                nt = (n1 * d2 - n2 * d1);
                dt = (d1 * d2);
            } else if (operador == '*') {
                nt = (n1 * n2);
                dt = (d1 * d2);
            } else {
                nt = (n1 * d2);
                dt = (d1 * n2);
            }
            System.out.print(nt + "/" + dt + " = ");
            simp(nt, dt);
        }
        scan.close();
    }
}

//4 1 / 2 + 3 / 4 1 / 2 - 3 / 4 2 / 3 * 6 / 6 1 / 2 / 3 / 4