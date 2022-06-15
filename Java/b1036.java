import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class b1036 {

    public static void main(String[] args) throws IOException {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    Double R1, R2;
	Double A = scan.nextDouble();
	Double B = scan.nextDouble();
	Double C = scan.nextDouble(); 
	if ((A == 0) || (((B * B) -(4 * A * C)) < 0)) {
		System.out.print("Impossivel calcular\n");
	} else {
		R1 = ((-B + Math.sqrt(((B * B) -(4 * A * C)))) / (2 * A));
		R2 = ((-B - Math.sqrt(((B * B) -(4 * A * C)))) / (2 * A));
			
		System.out.printf("R1 = %.5f\n", R1);
		System.out.printf("R2 = %.5f\n", R2);
		}
		scan.close();
	}

}

//10.0 20.1 5.1
//0.0 20.0 5.0
//10.3 203.0 5.0
//10.0 3.0 5.0