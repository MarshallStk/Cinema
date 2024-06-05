/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.produtos;

/**
 * A classe "Filme" é utilizada para definir as características do filme e sua sala, herdando da classe abstrata "Produto".
 * @author andreleite e andrealexandre
 */
public class Filme extends Produto {
    private int assentos;
    private int duracao;
    private int sala;
    private String genero;
    private String hora;
    private final int ID;
    
    private static int numFilme = 0;
    /**
     * O construtor da classe "Filme" recebe as informações para criar um filme.
     * @param assentos Define o número de assentos.
     * @param sala Define o número da sala.
     * @param duracao Define a duração do filme.
     * @param valor Define o preço do ingresso do filme.
     * @param nome Define o nome do filme.
     * @param genero Define a categoria do filme.
     * @param hora Define a hora do filme.
     * @param validade Define até quando ficará em cartaz.
     */
    public Filme(int assentos, int sala, int duracao, double valor , String nome, String genero, String hora ,String validade) {
        super(nome, validade, valor);
        this.assentos = assentos;
        this.duracao = duracao;
        this.sala = sala;
        this.genero = genero;
        this.hora = hora;
        this.ID = numFilme;
        numFilme++;
    }
    /**
     * Obtém o assento do filme.
     * @return Retorna o assento do filme.
     */
    public int getAssentos() {
        return assentos;
    }
    /**
     * Define o assento do filme.
     * @param assentos Define o assento do filme.
     */
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    /**
     * Obtém a duração do filme.
     * @return Retorna a duração do filme.
     */
    public int getDuracao() {
        return duracao;
    }
    /**
     * Define a duração do filme.
     * @param duracao Define a duração do filme em horas e minutos.
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    /**
     * Obtém a sala do filme.
     * @return Retorna a sala do filme.
     */
    public int getSala() {
        return sala;
    }
    /**
     * Define a sala do filme.
     * @param sala Define a sala do filme.
     */
    public void setSala(int sala) {
        this.sala = sala;
    }
    /**
     * Obtém o gênero do filme.
     * @return Retorna o gênero do filme.
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Define o gênero do filme.
     * @param genero Define o gênero do filme.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Obtém o horário do filme.
     * @return Retorna o horário do filme.
     */
    public String getHora() {
        return hora;
    }
    /**
     * Define o horário do filme.
     * @param hora Define o horário do filme.
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    /**
     * Obtem o número do filme.
     * @return Retorna o número do filme.
     */
    public static int getNumFilme() {
        return numFilme;
    }
    /**
     * Obtém o preço do filme.
     * @return Retorna o preço do filme.
     */
    @Override
    public double getValor() {
        return valor;
    }
    /**
     * Define o preço do filme.
     * @param valor Define o preço do filme,
     */
    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
    /**
     * Exibe os dados do filme.
     * @return Exibe os dados do filme.
     */
    @Override
    public String exibirDadosProdutos(){
        return "Filme{ Nome: "+ nome + "assentos: " + assentos + "Validade: "+ validade + "Duração: "+ duracao + "Sala: "+ sala + "Valor: "+ valor + '}';
    }
    /**
     * Exibe os dados do filme.
     * @return Exibe uma string mostrando os dados do filme.
     */
    @Override
    public String toString() {
        return "Filme{" + "Assentos=" + assentos + ", Valor= "+ valor + ", duracao=" + duracao + ", sala=" + sala + ", genero=" + genero + ", hora=" + hora + ", ID=" + ID + '}';
    }  
}
