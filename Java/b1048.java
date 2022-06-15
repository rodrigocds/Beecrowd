import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1048 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double salario = scan.nextDouble();
        int percentual = 0;
        double novosalario = 0, reajuste = 0;
        if (salario >= 0 && salario <= 400) {
            percentual = 15;
            reajuste = (salario * percentual) / 100;
            novosalario = reajuste + salario;
        } else if (salario >= 400.01 && salario <= 800) {
            percentual = 12;
            reajuste = (salario * percentual) / 100;
            novosalario = reajuste + salario;
        } else if (salario >= 800.01 && salario <= 1200) {
            percentual = 10;
            reajuste = (salario * percentual) / 100;
            novosalario = reajuste + salario;
        } else if (salario >= 1200.01 && salario <= 2000) {
            percentual = 7;
            reajuste = (salario * percentual) / 100;
            novosalario = reajuste + salario;
        } else if (salario > 2000) {
            percentual = 4;
            reajuste = (salario * percentual) / 100;
            novosalario = reajuste + salario;
        }
        System.out.printf("Novo salario: %.2f\n", novosalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");
        scan.close();
    }
    
}

//400.00
//800.01
//2000.00