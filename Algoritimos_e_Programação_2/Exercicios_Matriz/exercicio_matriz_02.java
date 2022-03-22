/*
 * 2) Dado a matriz A nxm, crie uma função que recebe a matriz A nxm por
 * parâmetro, em seguida a função aloca e devolve sua transposta At, onde A[i][j] = At
 * [j][i] para qualquer i e j. 
 */

public class exercicio_matriz_02 {

public static void main(String[] args){
int [][] m ={
{0,6},
{-1, 2},
{5,0}
};
System.out.println("=== Matriz ===");
imprimir(m);
int[][] t = transposta(m);

System.out.println("=== Matriz Transposta ===");
imprimir(t);
}

  public static int[][] transposta(int[][] a) {
    int[][] at = new int[a[0].length][a.length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        at[j][i] = a[i][j];
      }
    }
    return at;
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