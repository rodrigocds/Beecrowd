import java.io.IOException;

public class b1002 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double raio, n, area;
        raio = scan.nextDouble();
        n = 3.14159;
        area = n * raio * raio;
        System.out.format("A=%.4f%n", area);
        scan.close();
    }

}