/*3) Escreva um programa que conta o número de ocorrências de um
 *determinado caractere de um texto de um arquivo. O caractere deve ser
 *informado pelo usuário via teclado.
 */
package Arquivos_em_java;

import java.io.File;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Caractere: ");
        char c = teclado.next().charAt(0);
        int qtde = 0;
        String linha;
        Scanner leitorArquivo = new Scanner(new File("entrada.txt"));
        while (leitorArquivo.hasNextLine()) {
            linha = leitorArquivo.nextLine();
            qtde += contaCaractere(linha.toLowerCase(), c);
        }
        System.out.printf("Quantidade de %c = %d\n", c, qtde);
        teclado.close();
    }

    public static int contaCaractere(String s, char c) {
        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cont++;
            }
        }
        return cont;
    }
}
