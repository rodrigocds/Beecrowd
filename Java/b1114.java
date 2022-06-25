import java.io.IOException;
import java.util.Scanner;

public class b1114 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int senha = 2002;
        while (x != 2002) {
            System.out.println("Senha Invalida");
            x = scan.nextInt();
        }
        if (x == 2002) {
            System.out.println("Acesso Permitido");
        }
        scan.close();
    }

}