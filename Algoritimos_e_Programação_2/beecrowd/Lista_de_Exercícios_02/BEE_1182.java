package Algoritimos_e_Programação_2.Lista_de_Exercícios_02;

/**
 * Neste problema você deve ler um número que indica uma coluna de uma matriz na qual uma operação deve ser realizada,
 * um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma matriz M[12][12].
 *Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da matriz, conforme for o caso.
 *
 * Entrada
 * A primeira linha de entrada contem um número C (0 ≤ C ≤ 11) indicando a coluna que será considerada para operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.
 *
 * Saída
 * Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
 */
import java.io.IOException;
import java.util.Scanner;

public class BEE_1182 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        double soma = 0;
        char T = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int j = 0; j < M.length; j++) {
            soma += M[j][C];
        }

        if (T == 'M') {
            soma /= M.length;
        }
        System.out.println(String.format("%.1f", soma));
    }

}
