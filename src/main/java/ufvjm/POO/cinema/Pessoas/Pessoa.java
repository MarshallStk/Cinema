/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.Pessoas;

/**
 * A classe "Pessoa" é uma classe abstrata que define algumas características para funcionar como herança das classes
 * "Colaboradores", "Administrador" e "Cliente".
 * @author andreleite e andrealexandre
 */
public abstract class Pessoa {
    /**
     * Nome da pessoa a ser criada.
     */
    protected String nome;
    /**
     * CPF da pessoa a ser criada.
     */
    protected String CPF;
    /**
     * Construtor da classe "Pessoa".
     * @param nome O nome da pessoa.
     * @param CPF O CPF da pessoa.
     */
    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }
    /**
     * Método abstrato que retorna uma representação em string dos dados da pessoa.
     * @return Retorna uma representação em string dos dados da pessoa.
     */
    public abstract String exibirDados();
    /**
     * Retorna o nome da pessoa.
     * @return Retorna o nome da pessoa.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Define o nome da pessoa.
     * @param nome Estabelece o nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Retorna o CPF da pessoa.
     * @return Retorna o CPF da pessoa.
     */
    public String getCPF() {
        return CPF;
    }
    /**
     * Define o CPF da pessoa.
     * @param CPF Estabelece o CPF da pessoa.
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    /**
     * Retorna os dados da pessoa.
     * @return Retorna uma string exibindo os dados da pessoa.
     */
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", CPF=" + CPF + '}';
    } 
}
