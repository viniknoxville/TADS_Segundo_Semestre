/*1) Escreva um programa que abre um arquivo e lê todas as linhas do
 *arquivo e imprime na tela. O nome do arquivo deve ser informado pelo
 *usuário (teclado).
 */
package Arquivos_em_java;

import java.io.File;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do arquivo: ");
        String arquivo = teclado.nextLine();
        processarArquivo(arquivo);
        teclado.close();
    }

    public static void processarArquivo(String arquivo) throws Exception {
        Scanner leitor = new Scanner(new File(arquivo));
        String linha;
        while (leitor.hasNextLine()) {
            linha = leitor.nextLine();
            System.out.println(linha);
        }
    }
}
