import java.io.IOException;
import java.util.Scanner;

public class b1172 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x[] = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
            if (x[i] == 0 || x[i] < 0) {
                x[i] = 1;
            }
            System.out.println("X[" + i + "] = " + x[i]);
        }
        scan.close();
    }

}