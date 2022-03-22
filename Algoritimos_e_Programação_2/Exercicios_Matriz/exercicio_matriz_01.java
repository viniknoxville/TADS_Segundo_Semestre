/*
 *1) Construa uma fun��o que receba a quantidade de linhas (linhas) e de
 *colunas (colunas) e retorne uma matriz de dimens�o linhasXcolunas
 *contendo n�meros inteiros gerados aleatoriamente entre 0 e 100:
 *public static int[][] gerarMatriz(int linhas, int colunas) { � }
 *Depois apresente a matriz preenchida.
 *
 *Dica: Para gerar n�meros aleat�rios utilize a fun��o Math.random().
 *https://www.devmedia.com.br/numeros-aleatorios-em-java-a-classe-java-util-random/26355
 */

import java.util.Random;
import java.util.Scanner;

public class exercicio_matriz_01 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Linhas: ");
		int linhas = leitor.nextInt();
		System.out.print("Colunas: ");
		int colunas = leitor.nextInt();
		
		int[][] matriz = gerarMatriz(linhas, colunas);
		System.out.println("=== Matriz ===");
		imprimir(matriz);
	}

	public static int[][] gerarMatriz(int linhas, int colunas) {
		Random r = new Random();
		int[][] m = new int[linhas][colunas];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextInt(101);
			}
		}
		return m;

	}

	public static void imprimir(int[][] m) {
		for (int i = 0; 1 < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%3d ", m[i][j]);
			}
			System.out.println();

		}
	}
}
