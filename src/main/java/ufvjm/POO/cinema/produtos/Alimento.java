/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.produtos;

/**
 * A classe "Alimento" é utilizada para definir as características do alimento, herdando da classe abstrata "Produto".
 * @author andreleite e andrealexandre
 */
public class Alimento extends Produto{
    
    private int quantidade;
    private final int ID;
    
    private static int numproduto = 0;
    /**
     * O construtor da classe "Alimento" para ser feito a criação do alimento.
     * @param quantidade Define a quantidade de itens de um alimento.
     * @param nome Define o nome do alimento.
     * @param valor Define o preço do alimento.
     * @param validade Define a validade do alimento.
     */
    public Alimento(int quantidade, String nome, double valor, String validade) {
        super(nome, validade, valor);
        this.quantidade = quantidade;
        this.ID = numproduto;
        numproduto++;
    }
    /**
     * Obtém a quantidade de itens do alimento.
     * @return Retorna a quantidade de itens do alimento.
     */
    public int getQuantidade() {
        return quantidade;
    }
    /**
     * Define a quantdade de itens do alimento.
     * @param quantidade Define a quantidade de itens do alimento.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    /**
     * Obtém o número do alimento.
     * @return Retorna o número do alimento.
     */
    public static int getNumproduto() {
        return numproduto;
    }
    /**
     * Retorna as características do alimento.
     * @return Retorna uma string contendo as características do alimento.
     */
    @Override
    public String toString() {
        return "Alimento{ Nome: "+ nome + ", quantidade=" + quantidade + ", ID=" + ID + '}';
    }
    /**
     * Exibe os dados do alimento.
     * @return Exibe os dados do produtos em uma string.
     */
    @Override
    public String exibirDadosProdutos() {
        return "Alimento{ Nome: "+ nome + "Quantidade: " + quantidade + "Validade: "+ validade +'}';
    }
}
