import java.io.IOException;
import java.util.Scanner;

public class b3055 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int not1 = scan.nextInt();
        int med = scan.nextInt();
        int not2 = (med * 2) - not1;
        System.out.println(not2);
        scan.close();
    }

}