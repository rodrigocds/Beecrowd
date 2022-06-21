import java.io.IOException;

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