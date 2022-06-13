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
 * 6. (2,0) A multiplicação Russa consiste em:
 *
 * a) Escrever os números A e B, que se deseja multiplicar na parte superior das
 * colunas; 
 * b) Dividir A por 2, sucessivamente, ignorando o resto até chegar à
 * unidade, escrever os resultados da coluna A; 
 * c) Multiplicar B por 2 tantas
 * vezes quantas se haja dividido A por 2, escrever os resultados sucessivos na
 * coluna B; 
 * d) Somar todos os números da coluna B que estejam ao lado de um
 * número ímpar da coluna A.
 *
 * Criar uma função recursiva que permita fazer à multiplicação russa de 2
 * entradas.
 */
public class ex06 {

    public static void main(String[] args) {
        System.out.println(multiplicacaoRussa(27, 82));
    }

    public static int multiplicacaoRussa(int a, int b) {
        if (a == 1) {
            return b;
        }

        if (a % 2 != 0) {
            return b + multiplicacaoRussa(a / 2, b * 2);
        }
        return multiplicacaoRussa(a / 2, b * 2);
    }
}
