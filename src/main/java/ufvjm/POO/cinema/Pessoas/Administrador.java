/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.Pessoas;

/**
 * A classe "Administrador" é utilizada para representar o objeto do tipo administrador, sendo uma extensão da classe Pessoa.
 * @author andreleite e andrealexandre
 */
public class Administrador extends Pessoa {
    private String senha;
    private String cargo;
    private Cinema cinema;
    
    /**
     * Construtor da classe que utiliza as informações para criar o objeto "Administrador".
     * @param nome nome do administrador.
     * @param senha senha do administrador.
     * @param CPF CPF do administrador.
     * @param cinema Utiliza o parametro cinema para associar o cinema ao administrador.
     */
    public Administrador(String nome, String senha, String CPF, Cinema cinema) {
        super(nome, CPF);
        this.cargo = "Administrador";
        this.senha = senha;
        this.cinema = cinema;
    }
    /**
     * Retorna a senha do administrador.
     * @return Retorna a senha do administrador. 
     */
    public String getSenha() {
        return senha;
    }
    /**
     * Define a senha do administrador.
     * @param senha Retorna a nova senha do administrador.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Retorna o cargo do administrador.
     * @return Retorna o cargo do administrador.
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * Define o cargo do administrador.
     * @param cargo Define o novo cargo do administrador.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    /**
     * Retorna o cinema associado ao administrador.
     * @return Retorna o cinema associado ao administrador.

     */
    public Cinema getCinema() {
        return cinema;
    }
    /**
     * Define a associação do cinema ao administrador.
     * @param cinema para associar ao administrador.
     */
    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
    /**
     * Retorna uma representação em string do administrador.
     * @return uma string representando o administrador.
     */
    @Override
    public String toString() {
        return "Administrador{" + "nome=" + nome + ", CPF=" + CPF + '}';
    }
    /**
     * Exibe os dados do administrador.
     * @return uma string com os dados do administrador.
     */
    @Override
    public String exibirDados(){
        return "Administrador{: " + nome + ", CPF: " + CPF + '}';
    }
}