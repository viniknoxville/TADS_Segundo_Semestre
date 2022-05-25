/*6) Criar uma função que recebe por parâmetros duas matrizes, A e B, com n
 *linhas e m colunas. Sua função deve calcular a soma de A+B e armazenar
 *na matriz Cnxm e ao final retornar a matriz C.
 */
package Exercícios_de_Matrizes;

public class Ex06 {

    public static void main(String[] args) {
        int[][] a = {
            {3, 1},
            {5, 7},
            {9, 2},};
        int[][] b = {
            {2, 4},
            {8, 6},
            {1, 0}
        };
        int[][] c = soma(a, b);
        System.out.println("=== Matriz C ===");
        imprimir(c);
    }

    public static int[][] soma(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void imprimir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%2d ", m[i][j]);
            }
            System.out.println();
        }
    }

}
