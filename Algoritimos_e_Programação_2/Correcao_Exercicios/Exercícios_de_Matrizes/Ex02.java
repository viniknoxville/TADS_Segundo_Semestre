/*2) Dado a matriz Anxm, crie uma função que recebe a matriz Anxm por
 *parâmetro, em seguida a função aloca e devolve sua transposta At^, onde
 *A[i][j] = A^t[j][i] para qualquer i e j.
 */
package Exercícios_de_Matrizes;

public class Ex02 {

    public static void main(String[] args) {
        int[][] a = {
            {0, 6},
            {-1, 2},
            {5, 0}
        };
        System.out.println("=== Matriz A ===");
        imprimir(a);
        int[][] t = transposta(a);
        System.out.println("=== Matriz At ===");
        imprimir(t);
    }

    public static int[][] transposta(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
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
