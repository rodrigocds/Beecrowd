import java.io.IOException;
import java.util.Scanner;

public class b1118 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int escolha;
        float nota1, nota2, media;
        do {
            nota1 = scan.nextFloat();
            while (nota1 > 10 || nota1 < 0) {
                System.out.println("nota invalida");
                nota1 = scan.nextFloat();
            }
            nota2 = scan.nextFloat();
            while (nota2 > 10 || nota2 < 0) {
                System.out.println("nota invalida");
                nota2 = scan.nextFloat();
            }
            media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f\n", media);
            System.out.println("novo calculo (1-sim 2-nao)");
            escolha = scan.nextInt();
            while (escolha != 1 && escolha != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                escolha = scan.nextInt();
            }
        } while (escolha == 1);
        scan.close();
    }

}
