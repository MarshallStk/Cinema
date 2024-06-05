/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.produtos;

/**
 * A classe "Produto" é uma classe abstrata utilizada como herança para os produtos do cinema.
 * @author andreleite e andrealexandre
 */
public abstract class Produto {
    /**
     * O nome do produto a ser criado.
     */
    protected String nome;
    /**
     * A validade do produto a ser criado.
     */
    protected String validade;
    /**
     * O valor do produto a ser criado.
     */
    protected double valor;
    /**
     * Construtor padrão da classe "Produto".
     * @param nome O nome do produto.
     * @param validade A validade do produto.
     * @param valor O preço do produto.
     */
    public Produto(String nome, String validade, double valor) {
        this.nome = nome;
        this.validade = validade;
        this.valor = valor;
    }
    /**
     * Exibe os dados do produto.
     * @return Retorna uma string com os dados do produto.
     */
    public abstract String exibirDadosProdutos();
    /**
     * Obtém o nome do produto.
     * @return Retorna o nome do produto.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Define o nome para o produto.
     * @param nome Define o nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Obtém a validade do produto.
     * @return Retorna a validade do produto.
     */
    public String getValidade() {
        return validade;
    }
    /**
     * Define a validade do produto.
     * @param validade Define a validade do produto.
     */
    public void setValidade(String validade) {
        this.validade = validade;
    }
    /**
     * Obtém o valor do produto.
     * @return Retorna o valor do produto.
     */
    public double getValor() {
        return valor;
    }
    /**
     * Obtém os gastos do cliente.
     * @return Retorna os gastos do cliente.
     */

    /**
     * Obtém os valores do produto.
     * @param valor Obtém os valores do produto.
     */
    public void setValor(double valor) {
        this.valor = valor;
    } 
}
