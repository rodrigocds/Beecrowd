import java.io.IOException;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1038 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int cod = scan.nextInt();
        int qtd = scan.nextInt();

        if (cod == 1) {
            System.out.printf("Total: R$ %.2f\n", qtd * 4.00);
        } else if (cod == 2) {
            System.out.printf("Total: R$ %.2f\n", qtd * 4.50);
        } else if (cod == 3) {
            System.out.printf("Total: R$ %.2f\n", qtd * 5.00);
        } else if (cod == 4) {
            System.out.printf("Total: R$ %.2f\n", qtd * 2.00);
        } else if (cod == 5) {
            System.out.printf("Total: R$ %.2f\n", qtd * 1.50);
        }
        scan.close();
    }
}

// 3 2
// 4 3
// 2 3