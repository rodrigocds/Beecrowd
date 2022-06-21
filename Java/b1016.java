import java.io.IOException;
import java.util.Scanner;

public class b1016 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = X * 2;
        System.out.println(Y + " minutos");
        scan.close();
    }

}