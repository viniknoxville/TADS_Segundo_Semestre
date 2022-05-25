/*3) Implemente uma função recursiva para calcular a potência a^n, supondo
 *que tanto a quanto n sejam números inteiros positivos.
 */
package Recursividade;

public class Ex03 {

    public static void main(String[] args) {
        int p = potencia(3, 4);
        System.out.println("Potencia: " + p);
    }

    public static int potencia(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * potencia(a, n - 1);
    }
}
