import java.io.IOException;
import java.util.Scanner;

public class b3047 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int mae = scan.nextInt();
        int fil1 = scan.nextInt();
        int fil2 = scan.nextInt();
        int mve = mae - (fil1 + fil2);
        int troca = 0;
        if (mve < fil1) {
            troca = fil1;
            fil1 = mve;
            mve = troca;
        }
        if (mve < fil2) {
            troca = fil2;
            fil2 = mve;
            mve = troca;
        }
        System.out.println(mve);
        scan.close();
    }

}