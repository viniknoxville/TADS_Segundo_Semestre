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
 * Nome: Daiara Viei ra Barbosa 
 * Nome: Renan Scarpato
 *  
 * 4. (2,0) Dada uma string, criar uma função recursiva (sem laços) que compute
 * o número de caracteres 'x' na string.
 * 
 * Exemplos: 
 * contarX("xxhixx") -> 4 
 * contarX("xhixhix") -> 3 
 * contarX("hi") -> 0
 */

public class ex04 {


    public static void main(String[] args) {
        System.out.println(contarX("xxhixx"));
        System.out.println(contarX("xhixhix"));
        System.out.println(contarX("hi"));
    }

    public static int contarX(String s) {
      
        if (!s.contains("x")) {
            return 0;
        }
        if (s.length() == 0) {
            return 0;
        }       
        if (s.substring(0, 1).equals("x")) {
           
            return 1 + contarX(s.substring(1));
        }
        return contarX(s.substring(1));
    }
}