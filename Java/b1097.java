import java.io.IOException;

public class b1097 {

    public static void main(String[] args) throws IOException {
        int i = 1, j = 7;
        System.out.println("I=" + i + " J=" + j);
        for (int c = 0; c < 4; c++) {
            System.out.println("I=" + i + " J=" + --j);
            System.out.println("I=" + i + " J=" + --j);
            System.out.println("I=" + (i += 2) + " J=" + (j += 4));
        }
        System.out.println("I=" + i + " J=" + --j);
        System.out.println("I=" + i + " J=" + --j);
    }
}
