import java.io.IOException;

public class b1050 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int DDD;
        DDD = scan.nextInt();
        switch (DDD) {
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
            default:
                System.out.println("DDD nao cadastrado");
                break;
        }
        scan.close();
    }

}