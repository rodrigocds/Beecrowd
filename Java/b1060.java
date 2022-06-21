import java.io.IOException;

public class b1060 {

    public static void main(String[] args) throws IOException {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double X;
        int NP = 0;

        for (int i = 0; i < 6; i++) {
            X = scan.nextDouble();
            if (X > 0) {
                NP += 1;
            }
        }
        System.out.println(NP + " valores positivos");
        scan.close();
    }

}