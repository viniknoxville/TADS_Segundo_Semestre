/*2) Pesquise como funciona o método de ordenação por seleção (Selection
 *Sort) e implemente o método em Java.
 */
package Ordenação_de_Vetores_Bubble_Sort;

public class Ex02 {

    public static void main(String args[]) {
        int v[] = {3, 1, 7, 5, 8, 6, 2, 4};
        bubbleSort(v);
        imprimir(v);
    }

    public static void bubbleSort(int[] v) {
        int aux = 0;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) { // troca
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "]: " + v[i]);
        }
    }
}
