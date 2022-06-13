/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcos.aula02.intro_a_orientacao_a_objetos;

/**
 *
 * @author Marcos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criei o objeto chamando o construtor vazio
        Geladeira novaGeladeira = new Geladeira();
        double capacidade = novaGeladeira.getCapacidade();
        
        System.out.println(String.valueOf(capacidade));

        //Acionando o método 
        novaGeladeira.setCapacidade(40.0);
        System.out.println(String.valueOf(novaGeladeira.getCapacidade()
        ));
    }

}
