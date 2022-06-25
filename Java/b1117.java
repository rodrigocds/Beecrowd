import java.io.IOException;

public class b1117 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double notas[] = new double[2];
        int cont = 0;
        double nota;
        while (cont <= 1) {
            nota = scan.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                notas[cont++] = nota;
            }
        }
        double media = (notas[0] + notas[1]) / 2;
        System.out.println("media = " + String.format("%.2f", media));
        scan.close();
    }
}
