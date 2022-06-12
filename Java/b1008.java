import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1008 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int funcionarios, horas;
        funcionarios = scan.nextInt();
        horas = scan.nextInt();
        double valorPorHora = scan.nextDouble();
        double salario = horas * valorPorHora;
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
        scan.close();
    }

}

//25 100 5.50
//1 200 20.50
//6 145 15.55