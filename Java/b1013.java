import java.io.IOException;
import java.util.Scanner;

public class b1013 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int maiorAB = ((A + B + Math.abs(A - B)) / 2);
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.println(maiorABC + " eh o maior");
        scan.close();
    }

}