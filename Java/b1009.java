import java.io.IOException;

public class b1009 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double TOTAL, SALARIO, VENDAS;
        String NOME = scan.next();

        SALARIO = scan.nextDouble();
        VENDAS = scan.nextDouble();
        TOTAL = ((VENDAS * 15) / 100) + SALARIO;

        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
        scan.close();
    }

}