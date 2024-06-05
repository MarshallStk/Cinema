/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.produtos;

import ufvjm.POO.cinema.Pessoas.Cinema;
import java.util.ArrayList;
import java.util.List;


/**
 * A classe "Estoque" é onde serão salvos os produtos para monitoramento/edição.
 * @author andreleite e andrealexandre
 */
public class Estoque {
    private Produto produto;
    private int quantidade;
    private Cinema cadastro;
    private List<Produto> estoque;
    /**
     * Construtor padrão da classe "Estoque".
     * @param produto O produto que será armazenado no estoque.
     * @param quantidade A quantidade do mesmo produto que será armazenado.
     */
    public Estoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    /**
     * Construtor padrão da classe "Estoque".    
     * @param cadastro O cadastro do cinema.
     */
    public Estoque(Cinema cadastro) {
        this.estoque = new ArrayList<>();
        this.cadastro = cadastro;
    }
    /**
     * Obtém a lista de produtos no estoque.
     * @return Retorna a lista de produtos no estoque.
     */
    public List<Produto> Estoquelist(){
        return estoque;
    }
    /**
     * Adiciona um alimento ao estoque.
     * @param alimento O alimento a ser adicionado.
     */
    public void comprarAlimento(Alimento alimento){
        cadastro.adicionarAlimento(alimento);
    }
    /**
     * Adiciona um filme ao estoque.
     * @param filme O filme a ser adicionado.
     */
    public void comprarFilme(Filme filme){
        cadastro.adicionarFilme(filme);
    }
    /**
     * Editar os atributos do alimento.
     * @param nome Nome do alimento a ser editado.
     * @param quantidade Quantidade editada do alimento.
     */
    public void editarAlimento(String nome, int quantidade) {
        cadastro.editarAlimento(nome, quantidade);
    }
    /**
     * Editar os atributos do filme.
     * @param nome Nome do filme a ser editado.
     * @param assentos Número de assentos da sala do filme.
     * @param sala Número da sala do filme.
     * @param hora Horário do filme.
     */
    public void editarFilme(String nome, int assentos,int sala, String hora) {
        cadastro.editarFilme(nome, assentos, sala, hora);
    }
    /**
     * Buscar o alimento para ser excluído com base no nome.
     * @param nome O nome do alimento a ser excluído.
     */
    public void excluirAlimento(String nome) {
        cadastro.excluirAlimento(nome);
    }
    /**
     * Buscar o nome do filme a ser excluído do cartaz.
     * @param nome O nome do filme a ser excluído.
     */
    public void excluirFilme(String nome) {
        cadastro.excluirFilme(nome);
    }
    /**
     * Imprime a lista de alimentos.
     */
    public void imprimirListaAlimentos() {
        cadastro.imprimirListaAlimentos();
    }
    /**
     * Imprime a lista de filmes.
     */
    public void imprimirListaFilmes() {
        cadastro.imprimirListaFilmes();
    }
    /**
     * Imprime a lista de salas que contém no cinema.
     */
    public void imprimirListaDeSalas(){
        cadastro.imprimirListaDeSalas();
    }
    /**
     * Obtém o produto que está associado ao estoque.
     * @return Retorna o produto associado ao estoque.
     */
    public Produto getProduto() {
        return produto;
    }
    /**
     * Define o produto que está associado ao estoque.
     * @param produto Define o produto associado ao estoque.
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    /**
     * Obtem a quantidade do produto selecionado no estoque.
     * @return Retorna a quantidade do protudo selecionado no estoque.
     */
    public int getQuantidade() {
        return quantidade;
    }
    /**
     * Define a quantidade do produto selecionado no estoque.
     * @param quantidade Define a quantidade do produto selecionado.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    /**
     * Exibe a informação do produto contendo sua quantidade no estoque.
     * @return Retorna uma string informando o produto e sua quantidade no estoque.
     */
    @Override
    public String toString() {
        return "Estoque{" + "produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    /**
     * Define o produto cadastrado no estoque do cinema.
     * @param cadastro Define o produto cadastrado no estoque do cinema.
     */
    public void setCadastro(Cinema cadastro) {
        this.cadastro = cadastro;
    }
}