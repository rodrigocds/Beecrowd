import java.io.IOException;
import java.util.Scanner;

public class b1066 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x, par = 0, impar = 0, positivo = 0, negativo = 0;
        for (int i = 0; i < 5; i++) {
            x = scan.nextInt();
            if (x % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (x > 0) {
                positivo++;
            }
            if (x < 0) {
                negativo++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
        scan.close();
    }

}