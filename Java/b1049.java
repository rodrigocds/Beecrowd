import java.io.IOException;
import java.util.Scanner;

public class b1049 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String um = scan.next();
        String dois = scan.next();
        String tres = scan.next();
        if (um.equals("vertebrado") && dois.equals("ave") && tres.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (um.equals("vertebrado") && dois.equals("ave") && tres.equals("onivoro")) {
            System.out.println("pomba");
        } else if (um.equals("vertebrado") && dois.equals("mamifero") && tres.equals("onivoro")) {
            System.out.println("homem");
        } else if (um.equals("vertebrado") && dois.equals("mamifero") && tres.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (um.equals("invertebrado") && dois.equals("inseto") && tres.equals("hematofago")) {
            System.out.println("pulga");
        } else if (um.equals("invertebrado") && dois.equals("inseto") && tres.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (um.equals("invertebrado") && dois.equals("anelideo") && tres.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (um.equals("invertebrado") && dois.equals("anelideo") && tres.equals("onivoro")) {
            System.out.println("minhoca");
        }
        scan.close();
    }

}