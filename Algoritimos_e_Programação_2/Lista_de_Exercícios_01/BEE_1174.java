package Lista_de_Exercícios_01;

/**
 *
 * @author Marcos
 */
import java.io.IOException;
import java.util.Scanner;

public class BEE_1174 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double[] A = new double[100];
        for (int i = 0; i < A.length; i++) {
            A[i] = leitor.nextDouble();
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) {
                System.out.println(String.format("A[" + i + "] = %.1f", A[i]));
            }
        }

    }

}
