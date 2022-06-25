import java.io.IOException;
import java.util.Scanner;

public class b1174 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float A[] = new float[100];
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextFloat();
            if (A[i] <= 10) {
                System.out.println("A[" + i + "] = " + A[i]);
            }
        }
        scan.close();
    }

}