import java.io.IOException;

public class b1155 {

    public static void main(String[] args) throws IOException {
        float s = 1;
        for (int i = 2; i <= 100; i++) {
            s += 1f / i;
        }
        System.out.printf("%.2f\n", s);
    }

}
