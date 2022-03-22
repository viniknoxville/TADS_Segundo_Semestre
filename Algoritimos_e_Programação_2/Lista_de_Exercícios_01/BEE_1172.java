package Lista_de_Exercícios_01;

/**
 *
 * @author Marcos
 */

import java.io.IOException;
import java.util.Scanner;

public class BEE_1172 {

    public static void main(String[] args) throws IOException {

        int[] vetor = new int[10];

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();

        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 0) {
                vetor[i] = 1;

            }
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }

    }

}
