import java.io.IOException;

public class b2752 {

    public static void main(String[] args) throws IOException {
        String saida = "";
        saida = "AMO FAZER EXERCICIO NO URI";
        System.out.printf("<%s>\n", saida);
        System.out.printf("<%30s>\n", saida);
        System.out.printf("<%.20s>\n", saida);
        System.out.printf("<%-20s>\n", saida);
        System.out.printf("<%-30s>\n", saida);
        System.out.printf("<%.30s>\n", saida);
        System.out.printf("<%30.20s>\n", saida);
        System.out.printf("<%-30.20s>\n", saida);
    }

}