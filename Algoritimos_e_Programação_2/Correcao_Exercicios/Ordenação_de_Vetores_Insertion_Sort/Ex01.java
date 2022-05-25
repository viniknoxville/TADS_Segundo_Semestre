/*Considere um vetor já quase ordenado, somente o elemento último elemento
 *está na posição errada, escreva uma função que receba um vetor já quase
 *ordenado, e reordene o vetor, em no máximo n passos onde n é o tamanho
 *do vetor, sem utilizar o método bolha.
 */
package Ordenação_de_Vetores_Insertion_Sort;

public class Ex01 {

    public static void main(String[] args) {
        int[] vetor = {3, 5, 9, 11, 15, 17, 19, 6};
        ordenarUltimo(vetor);
        imprimir(vetor);
    }

    public static void ordenarUltimo(int[] v) {
        int k = v.length - 1;
        int x = v[k];
        while (k > 0 && x < v[k - 1]) {
            v[k] = v[k - 1];
            k--;
        }
        v[k] = x;
    }

    public static void imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
