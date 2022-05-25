/*4) O traço de uma matriz é a soma dos elementos de sua diagonal principal.
 *Crie uma função que receba uma matriz quadrada (número de linhas =
 *número de colunas) e devolva o seu traço.
 */
package Exercícios_de_Matrizes;

public class Ex04 {

    public static void main(String[] args) {
        int[][] m = {
            {2, 2, 2, 2},
            {1, 1, 1, 1},
            {3, 3, 3, 3},
            {1, 2, 3, 4}
        };
        int traco = calculaTraco(m);
        System.out.println("TraÃ§o da Matriz = " + traco);
    }

    public static int calculaTraco(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            soma += m[i][i];
        }
        return soma;
    }

    public static int calculaTraco1(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }
}
