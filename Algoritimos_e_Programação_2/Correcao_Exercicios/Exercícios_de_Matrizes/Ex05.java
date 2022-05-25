/*5) Uma matriz quadrada A é simétrica se e somente se A[i][j] = A[j][i].
 *Crie uma função para verificar se uma matriz de números inteiros é
 *simétrica, se a matriz for simétrica sua função retorna true e false caso
 *contrário. 
 */
package Exercícios_de_Matrizes;

public class Ex05 {

    public static void main(String[] args) {
        int[][] m = {
            {3, 1, 2},
            {1, 4, 3},
            {2, 3, 5}
        };
        boolean simetrica = ehSimetrica(m);
        System.out.println("Matriz SimÃŠtrica: " + simetrica);
    }

    public static boolean ehSimetrica(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
