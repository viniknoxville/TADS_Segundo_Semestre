/*1) Desenvolver um programa que:
 *a) Crie um vetor de 100 números inteiros gerados aleatoriamente (utilize a classe
 *Random);
 *b) Solicite que o usuário digite um número;
 *c) Utilizando o método de busca binária, verificar se o número consta no vetor. Caso o
 *número esteja repetido no vetor retornar o primeiro encontrado;
 *d) Apresentar um mensagem indicando em qual posição do vetor o número foi
 *encontrado. Caso o número não conste no vetor, apresentar uma mensagem indicando
 *isso.
 */
package Busca_em_Vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer[] v = gerarVetor();
        // ordena o vetor
        Arrays.sort(v, Collections.reverseOrder());
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

    public static Integer[] gerarVetor() {
        Random r = new Random();
        Integer[] vetor = new Integer[100];
        for (int i = 0; i < vetor.length; i++) {
            // gera um numero aleatÃ³rio entre 0 e 999
            vetor[i] = r.nextInt(1000);
        }
        return vetor;
    }

    public static int buscaBinaria(Integer v[], int x) {
        int i = 0;
        int f = v.length - 1;
        int m;
        while (i <= f) {
            m = (i + f) / 2;
            if (v[m] == x) {
                return m;
            }
            if (x > v[m]) // esquerda
            {
                f = m - 1;
            } else // x > v[m] - direita
            {
                i = m + 1;
            }
        }
        return -1;
    }

    public static void imprimir(Integer[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
