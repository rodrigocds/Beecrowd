import java.io.IOException;

public class b1007 {

    public static void main(String[] args) throws IOException {

    java.util.Scanner scan = new java.util.Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
        scan.close();
    }

}