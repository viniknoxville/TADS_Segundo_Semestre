/*
 *3) Criar uma função que receba uma matriz nxm de números inteiros e
 *devolva o maior valor presente nesta matriz.
 */
package Exercícios_de_Matrizes;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        lerMatriz(matriz);
        int maior = maiorValor(matriz);
        System.out.println("Maior Valor: " + maior);
    }

    public static int maiorValor(int[][] m) {
        int maior = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }
        return maior;
    }

    public static void lerMatriz(int[][] m) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                m[i][j] = leitor.nextInt();
            }
        }
    }

}
