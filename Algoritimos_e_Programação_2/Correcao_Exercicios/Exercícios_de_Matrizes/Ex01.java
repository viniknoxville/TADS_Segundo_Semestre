/*1) Construa uma função que receba a quantidade de linhas (linhas) e de
 *colunas (colunas) e retorne uma matriz de dimensão linhasXcolunas
 *contendo números inteiros gerados aleatoriamente entre 0 e 100:
 *public static int[][] gerarMatriz(int linhas, int colunas) { … }
 *Depois apresente a matriz preenchida.
 *Dica: Para gerar números aleatórios utilize a função Math.random().
 *https://www.devmedia.com.br/numeros-aleatorios-em-java-a-classe-java-util-random/26355
 */
package Exercícios_de_Matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Linhas: ");
        int linhas = leitor.nextInt();
        System.out.print("Colunas: ");
        int colunas = leitor.nextInt();
        int[][] matriz = gerarMatriz(linhas, colunas);
        System.out.println("=== Matriz Gerada ===");
        imprimir(matriz);
        System.out.println();
    }

    public static int[][] gerarMatriz(int linhas, int colunas) {
        int[][] m = new int[linhas][colunas];
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(101);
            }
        }
        return m;
    }

    public static void imprimir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();
        }
    }
}
