/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marcos.ado02.algoritimo2;

/**
 *
 * @author Análise e Desenvolvimento de Sistemas 2°Semestre, Turma B - Noturno
 *
 * Nome: Marcos Vinicius dos SantosRibeiro 
 * Nome: Daiara Vieira Barbosa 
 * Nome: Renan Scarpato
 * 
 *  5. (2,0) Temos triângulos feito de blocos. A linha superior tem 1 bloco, a
 *  próxima linha abaixo tem 2 blocos, a próxima linha tem 3 blocos e assim por
 *  diante. Criar uma função recursiva que calcule (sem loops ou multiplicação)
 *  o número total de blocos em um triângulo com o número especificado de linhas.
 * 
 * Exemplos: 
 * triangulo(0) -> 0 
 * triangulo(1) -> 1 
 * triangulo(2) -> 3
 */

public class ex05 {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println(triangulo(i));
        }
    }

    public static int triangulo(int n) {
   
        if (n == 0) {
            return 0;
        }
        return n + triangulo(n - 1);
    }
}
