import java.io.IOException;

public class b1080 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int maior = 0;
        int posicao = 1;
        for (int i = 1; i <= 100; i++) {
            int num = scan.nextInt();
            if (maior == 1) {
                maior = num;
                posicao = 1;
            } else if (num > maior) {
                maior = num;
                posicao = i;
            }

        }
        System.out.println(maior);
        System.out.println(posicao);
        scan.close();
    }

}