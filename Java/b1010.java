import java.io.IOException;
public class b1010 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
        double valorPeca1, valorPeca2, Resultado;
        codPeca1 = scan.nextInt();
        qtdPeca1 = scan.nextInt();
        valorPeca1 = scan.nextDouble();
        codPeca2 = scan.nextInt();
        qtdPeca2 = scan.nextInt();
        valorPeca2 = scan.nextDouble();
        Resultado = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", Resultado);
        scan.close();
    }

}