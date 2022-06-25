import java.io.IOException;

public class b1142 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int N;
        N = scan.nextInt();
        for (int i = 1; i <= N * 4; i += 4) {
            System.out.print(i + " ");
            System.out.print(i + 1 + " ");
            System.out.print(i + 2 + " ");
            System.out.println("PUM");
        }
        scan.close();
    }

}
