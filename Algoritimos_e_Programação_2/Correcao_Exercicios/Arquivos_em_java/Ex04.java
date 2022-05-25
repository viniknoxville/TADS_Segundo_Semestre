/*4) Algumas vezes podemos processar os dados armazenados em arquivo texto,
 *onde cada linha corresponderia a um nome do aluno e sua nota, separadas por
 *um ponto e vírgula (“;”).
 *
 *Exemplo do arquivo texto alunos.txt
 *Jose da Silva;10.0
 *Manoel Pereira;5.0
 *Carlos Dias;7.0
 *Ana Andrade;6.5
 *
 *Escreva um programa que leia as linhas do arquivo alunos.txt, para cada
 *linha lida, você deve separar o nome e a nota do aluno, ao final seu programa
 *deve informar a média das notas lidas e o nome e nota do aluno com a maior
 *nota.
 */
package Arquivos_em_java;

import java.io.File;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(new File("alunos.txt"));
        double soma = 0.0;
        int qtde = 0;
        double maiorNota = 0.0;
        String nome = "";
        while (leitor.hasNextLine()) {
            String[] dados = leitor.nextLine().split(";");
            double nota = Double.parseDouble(dados[1]);
            soma += nota;
            qtde++;
            if (nota > maiorNota) {
                maiorNota = nota;
                nome = dados[0];
            }
        }
        System.out.printf("Nome: %s|Nota: %.1f\n", nome, maiorNota);
        System.out.printf("MÃ©dia: %.1f\n", soma / qtde);
    }
}
