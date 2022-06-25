import java.io.IOException;
import java.util.Scanner;

public class b1173 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[10];
        vetor[0] = scan.nextInt();
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
        scan.close();
    }

}