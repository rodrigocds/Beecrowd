import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
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

//12 1 5.30 16 2 5.10
//13 2 15.30 161 4 5.20
// 1 1 15.10 2 1 15.10