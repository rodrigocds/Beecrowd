import java.io.IOException;
import java.util.Scanner;

public class b1131 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int grenais = 0, vitinter = 0, vitgremio = 0;
        int golinter = 0, golgremio = 0, empates = 0, escolha = 1;
        while (escolha == 1) {
            golinter = scan.nextInt();
            golgremio = scan.nextInt();
            grenais++;
            if (golinter > golgremio) {
                vitinter++;
            }
            if (golgremio > golinter) {
                vitgremio++;
            }
            if (golgremio == golinter) {
                empates++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            escolha = scan.nextInt();
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitinter);
        System.out.println("Gremio:" + vitgremio);
        System.out.println("Empates:" + empates);
        if (vitinter > vitgremio) {
            System.out.println("Inter venceu mais");
        }
        if (vitgremio > vitinter) {
            System.out.println("Gremio venceu mais");
        }
        if (vitinter == vitgremio) {
            System.out.println("Nao houve vencedor");
        }
        scan.close();
    }

}