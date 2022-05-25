package Algoritimos_e_Programação_2.Lista_de_Exercícios_01;

/**
 * Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1.
 * Em seguida mostre o vetor X.
 *
 * Entrada
 * A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
 *
 * Saída
 * Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
 *
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
