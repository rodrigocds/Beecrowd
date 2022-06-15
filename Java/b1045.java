import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1045 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        if (B > A) {
            B = A + B;
            A = B - A;
            B = B - A;
        }
        if (C > A) {
            C = A + C;
            A = C - A;
            C = C - A;
        }
        if (A >= B + C || B >= C + A || C >= A + B) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else if (A == B && A == C && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ((A == B && C != A) || (A == C && C != B) || (B == C && B != A)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        scan.close();
    }

}

//7.0 5.0 7.0
//6.0 6.0 10.0
//6.0 6.0 6.0
//5.0 7.0 2.0
//6.0 8.0 10.0