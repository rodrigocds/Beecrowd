import java.io.IOException;

public class b1078 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int N = scan.nextInt();
        int i, R;

        for (i = 1; i <= 10; ++i) {
            R = N * i;
            System.out.println(i + " x " + N + " = " + R);

        }

    }

}