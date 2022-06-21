import java.io.IOException;
import java.util.Scanner;

public class b1069 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            int qtdDiamante = 0;
            boolean troca = true;
            String diamante = scan.next();
            diamante = diamante.replaceAll("[.]", "");
            while (troca == true) {
                if (diamante.indexOf("<>") > -1) {
                    qtdDiamante++;
                    diamante = diamante.replaceFirst("<>", "");
                } else {
                    troca = false;
                }
            }
            System.out.println(qtdDiamante);
        }
        scan.close();
    }

}