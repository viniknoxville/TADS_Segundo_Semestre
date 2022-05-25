package Algoritimos_e_Programação_2.Lista_de_Exercicios_03;

/**
 * Crie um programa para ordenar um conjunto de strings pelo seu tamanho. Seu programa deve receber um conjunto
 * de strings e retornar este mesmo conjunto ordenado pelo tamanho das palavras, se o tamanho das strings for igual,
 * deve-se manter a ordem original do conjunto.
 *
 * Entrada
 * A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada caso de teste
 * poderá conter de 1 a 50 strings inclusive, e cada uma das strings poderá conter entre 1 e 50 caracteres inclusive.
 * Os caracteres poderão ser espaços, letras, ou números.
 *
 * Saída
 * A saída deve conter o conjunto de strings da entrada ordenado pelo tamanho das strings. Um espaço em branco deve ser
 * impresso entre duas palavras.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BEE_1244 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for(int q=0 ; q<n ; q++){
            String entrada = sc.nextLine();
            String[] entr = entrada.split(" ");
            List<String> lista = new ArrayList<>();

            for(int i=0 ; i<entr.length ; i++)
                lista.add(entr[i]);

            while(!lista.isEmpty()) {
                String maior = "";
                for(String x : lista)
                    if(x.length() > maior.length())
                        maior = x;

                System.out.printf("%s",maior);
                if(lista.contains(maior))
                    lista.remove(maior);

                if(!lista.isEmpty())
                    System.out.printf(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
