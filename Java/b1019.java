import java.io.IOException;
import java.util.Scanner;

public class b1019 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int seg = scan.nextInt();
        int hor = seg / 3600;
        seg %= 3600;
        int min = seg / 60;
        seg %= 60;
        System.out.println(hor + ":" + min + ":" + seg);
        scan.close();
    }

}