/*2) Reescrever a função de busca binária para que ela funcione em um vetor
 *decrescente.
 */
package Busca_em_Vetores;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] v = gerarVetor();
        // ordena o vetor
        Arrays.sort(v);
        imprimir(v);
        System.out.print("Numero: ");
        int n = leitor.nextInt();
        int p = buscaBinaria(v, n);
        if (p >= 0) {
            System.out.println("Numero na posicao: " + p);
        } else {
            System.out.println("Numero nao consta no vetor.");
        }
        leitor.close();
    }

    public static int[] gerarVetor() {
        Random r = new Random();
        int[] vetor = new int[100];
        for (int i = 0; i < vetor.length; i++) {
            // gera um numero aleatÃ³rio entre 0 e 999
            vetor[i] = r.nextInt(1000);
        }
        return vetor;
    }

    public static int buscaBinaria(int v[], int x) {
        int i = 0;
        int f = v.length - 1;
        int m;
        while (i <= f) {
            m = (i + f) / 2;
            if (v[m] == x) {
                return m;
            }
            if (x < v[m]) // esquerda
            {
                f = m - 1;
            } else // x > v[m] - direita
            {
                i = m + 1;
            }
        }
        return -1;
    }

    public static void imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
