
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1040 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float d = scan.nextFloat();
        float media = (((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10);
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        }
        if (media < 5) {
            System.out.println("Aluno reprovado.");
        }
        if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            float e = scan.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", e);
            float mediab = (media + e) / 2;
            if (mediab >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediab);
        }
        scan.close();
    }
}

//2.0 4.0 7.5 8.0 6.4
//2.0 6.5 4.0 9.0
//9.0 4.0 8.5 9.0