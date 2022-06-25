import java.io.IOException;

public class b1096 {

    public static void main(String[] args) throws IOException {
        int i = 1;
        for (int j = 7; i <= 9;) {
            System.out.println("I=" + i + " J=" + j);
            System.out.println("I=" + i + " J=" + (j - 1));
            System.out.println("I=" + i + " J=" + (j - 2));
            i += 2;
        }
    }

}
