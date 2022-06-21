import java.io.IOException;

public class b1073 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + (i * i));
            }
        }
        scan.close();
    }

}
