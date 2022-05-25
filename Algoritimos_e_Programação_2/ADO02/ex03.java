/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marcos.ado02.algoritimo2;

/**
 *
 * @author Análise e Desenvolvimento de Sistemas 2°Semestre, Turma B - Noturno
 *
 * Nome: Marcos Vinicius dos Santos Ribeiro
 * Nome: Daiara Vieira Barbosa 
 * Nome: Renan Scarpato
 *
 *  3. (2,0) Temos vários coelhos e cada coelho tem duas orelhas grandes e
 * flexíveis. Queremos calcular o número total de orelhas em todos os coelhos de
 * forma recursiva (sem loops ou multiplicação). Criar uma função recursiva que
 * receba um número N representando o número de coelhos e retorne a número total
 * de orelhas.

 * Exemplos: 
 * orelhasCoelho(0) -> 0 
 * orelhasCoelho(1) -> 2 
 * orelhasCoelho(2) -> 4     
 */

public class ex03 {

    public static void main(String[] args) {
        System.out.println(orelhasCoelho(0));
        System.out.println(orelhasCoelho(1));
        System.out.println(orelhasCoelho(2));
    }

    public static int orelhasCoelho(int n) {

        if (n == 0) {
            return 0;
        }

        return 2 + orelhasCoelho(n - 1);
    }

}
