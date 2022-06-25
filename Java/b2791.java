import java.io.IOException;
import java.util.Scanner;

public class b2791 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] copo = new int[4];
        for (int i = 0; i < copo.length; i++) {
            copo[i] = scan.nextInt();
        }
        for (int i = 0; i < copo.length; i++) {
            if (copo[i] == 1)
                System.out.println(i + 1);
        }
        scan.close();
    }
}