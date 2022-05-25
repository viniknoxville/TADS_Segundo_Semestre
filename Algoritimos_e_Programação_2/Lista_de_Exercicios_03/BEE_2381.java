package Algoritimos_e_Programação_2.Lista_de_Exercicios_03;

/**
 * Tia Joana é uma respeitada professora e tem vários alunos. Em sua última aula, ela prometeu que iria sortear um aluno
 * para ganhar um bônus especial na nota final: ela colocou N pedaços de papel numerados de 1 a N em um saquinho e
 * sorteou um determinado número K; o aluno premiado foi o K-ésimo aluno na lista de chamada.
 *
 * O problema é que a Tia Joana esqueceu o diário de classe, então ela não tem como saber qual número corresponde a
 * qual aluno. Ela sabe os nomes de todos os alunos, e que os números deles, de 1 até N, são atribuídos de acordo com a
 * ordem alfabética, mas os alunos dela estão muito ansiosos e querem logo saber quem foi o vencedor.
 *
 * Dado os nomes dos alunos da Tia Joana e o número sorteado, determine o nome do aluno que deve receber o bônus.
 *
 * Entrada
 * A primeira linha contém dois inteiros N e K separados por um espaço em branco (1 ≤ K ≤ N ≤ 100). Cada uma das N
 * linhas seguintes contém uma cadeia de caracteres de tamanho mínimo 1 e máximo 20 representando os nomes dos alunos.
 * Os nomes são compostos apenas por letras minúsculas de 'a' a 'z'.
 *
 * Saída
 * Seu programa deve imprimir uma única linha, contendo o nome do aluno que deve receber o bônus.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BEE_2381 {

    public static void main (String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String entrada[] = in.readLine().split(" ");
        int N = Integer.parseInt(entrada[0]);
        int K = Integer.parseInt(entrada[1]);

        String alunos[] = new String[N];
        for(int i = 0; i < N; ++i){
            alunos[i] = in.readLine();
        }

        Arrays.sort(alunos);

        System.out.printf("%s\n", alunos[K - 1]);
    }
}
