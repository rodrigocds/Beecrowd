import java.io.IOException;

public class b1095 {

    public static void main(String[] args) throws IOException {
        int i = 1;
        for (int j = 60; j >= 0; j -= 5) {
            System.out.println("I=" + i + " J=" + j);
            i = i + 3;
        }
    }

}
