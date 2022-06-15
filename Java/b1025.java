import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class b1025 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int qtdmarm, qtdtent, casos = 0;
        do {
            qtdmarm = scan.nextInt();
            qtdtent = scan.nextInt();
            if (qtdmarm == 0 && qtdtent == 0) {
                break;
            }
            int marm [] = new int [qtdmarm];
            for (int i = 0; i < qtdmarm; i++) {
                marm[i] = scan.nextInt();
            }
            Arrays.sort(marm);
            int tent [] = new int [qtdtent];
            for (int i = 0; i < qtdtent; i++) {
                tent[i] = scan.nextInt();
            }
            casos++;
            System.out.println("CASE# " + casos + ":");
            for (int k : tent) {
                if (Arrays.binarySearch(marm, k) >= 0) {
                    for (int j = 0; j < marm.length; j++) {
                        if (marm[j] == k) {
                            System.out.println(k + " found at " + ++j);
                            break;
                        }
                    }
                } else {
                    System.out.println(k + " not found");
                }
            }
        } while (qtdmarm > 0 && qtdtent > 0);
        scan.close();
    }
}

//4 1 2 3 5 1 5 5 2 1 3 3 3 1 2 3 0 0