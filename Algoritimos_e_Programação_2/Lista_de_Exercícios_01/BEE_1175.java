package Lista_de_Exercícios_01;

/**
 *
 * @author Marcos
 */
import java.io.IOException;
import java.util.Scanner;

public class BEE_1175 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int aux;
        int[] N = new int[20];
        for (int i = 0; i < N.length; i++) {
            N[i] = leitor.nextInt();
        }
        for (int i = 0; i < (N.length / 2); i++) {
            aux = N[i];
            N[i] = N[N.length - 1 - i];
            N[N.length - 1 - i] = aux;
        }
        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }

}
