import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1009 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double TOTAL, SALARIO, VENDAS;
        String NOME = scan.next();
        
        SALARIO = scan.nextDouble();
        VENDAS = scan.nextDouble();
        TOTAL = ((VENDAS * 15) /100) + SALARIO;
        
        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
        scan.close();
    }

}

//JOAO 500.00 1230.30
//PEDRO 700.00 0.00
//MANGOJATA 1700.00 1230.50