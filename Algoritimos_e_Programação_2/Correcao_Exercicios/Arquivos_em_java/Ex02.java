/*2) Reescreva o programa anterior para que toda linha que comece com //
 *não seja impressa na tela.
 */
package Arquivos_em_java;

import java.io.File;
import java.util.Scanner;

public class Ex02 {

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
            if (!linha.startsWith("//")) {
                System.out.println(linha);
            }
        }
    }
}
