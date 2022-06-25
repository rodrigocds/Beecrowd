import java.io.IOException;
import java.util.Scanner;

public class b2373 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int rep = scan.nextInt();
        int quebrado = 0;
        for (int i = 0; i < rep; i++) {
            int lata = scan.nextInt();
            int copo = scan.nextInt();
            if (lata > copo) {
                quebrado += copo;
            }
        }
        System.out.println(quebrado);
        scan.close();
    }

}
