import java.io.IOException;
import java.util.Scanner;

public class b1020 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int diasini = scan.nextInt();
        int ano = diasini / 365;
        diasini = diasini % 365;
        int mes = diasini / 30;
        diasini = diasini % 30;
        int dias = diasini;
        System.out.printf("%d ano(s)%n", ano);
        System.out.printf("%d mes(es)%n", mes);
        System.out.printf("%d dia(s)%n", dias);
        scan.close();

    }

}