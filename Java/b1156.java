import java.io.IOException;

public class b1156 {

    public static void main(String[] args) throws IOException {
        float S = 1, i, j;
        for (i = 3, j = 2; i <= 39; i += 2, j *= 2) {
            S += i / j;
        }
        System.out.printf("%.2f\n", S);
    }

}
