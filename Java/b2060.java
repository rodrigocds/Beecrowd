import java.io.IOException;

import java.util.Scanner;

public class b2060 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int rep = scan.nextInt();
        int m2 = 0, m3 = 0, m4 = 0, m5 = 0;
        for (int i = 0; i < rep; i++) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                m2++;
            }
            if (num % 3 == 0) {
                m3++;
            }
            if (num % 4 == 0) {
                m4++;
            }
            if (num % 5 == 0) {
                m5++;
            }
        }
        System.out.println(m2 + " Multiplo(s) de 2");
        System.out.println(m3 + " Multiplo(s) de 3");
        System.out.println(m4 + " Multiplo(s) de 4");
        System.out.println(m5 + " Multiplo(s) de 5");
        scan.close();
    }

}
