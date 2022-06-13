/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marcos.aula02.intro_a_orientacao_a_objetos;

/**
 *
 * @author Marcos
 */
public class Geladeira {

    //Atributos (O que construir)
    private String cor;
    private int porta;
    private int voltagem;
    private String modelo;
    private double temperatura;
    private static String marca;
    private double capacidade = 20.0;

    //Construtor (Como eu vou construir - instruções adicionais)
    public Geladeira() {
        cor = "preta";
    }

    //Construtor 2
    public Geladeira(int pVoltagem) { //pVoltagem 
        cor = "preta";
        this.voltagem = pVoltagem;
    }
    
    //Métodos e acessores
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double novoValor) {
        this.capacidade = novoValor;
    }
     

    //Ações - Metodos
    public void ligar() {
        this.temperatura = 8.0;
    }

    public void desligar() {
    }

    public void gelar() {
    }

    public void aumentarTemperatura() {
        this.temperatura += 1;
    }
    
       public void aumentarTemperatura(double novaTemp) {
           this.temperatura = novaTemp;
    }

    public void diminuirTemperatura() {
    }
}
