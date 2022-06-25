import java.io.IOException;
import java.util.Scanner;

public class b1132 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int troca = 0, soma = 0;
        if (num2 < num1) {
            troca = num2;
            num2 = num1;
            num1 = troca;
        }
        for (int i = num1; i <= num2; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
        scan.close();
    }
}
