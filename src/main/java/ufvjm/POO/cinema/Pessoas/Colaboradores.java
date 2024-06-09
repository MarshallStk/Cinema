/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.Pessoas;
/**
 * A classe "Colaboradores" está representando um objeto "Colaboradores", herdando da classe abstrata "Pessoa".
 * @author andreleite e andrealexandre
 */
public class Colaboradores extends Pessoa {
    private String senha;
    private String cargo;
    /**
     * O construtor padrão da classe "Colaboradores" utilizado para criar os colaboradores.
     * @param nome
     * @param senha
     * @param CPF
     * @param cargo
     * @param cadastro 
     */
    
    public Colaboradores(String nome, String senha, String CPF, String cargo, Cinema cadastro){
        super(nome, CPF);
        this.senha = senha;
        this.cargo = cargo;
    }
    /**
     * Obtém a senha do funcionário.
     * @return Retorna a senha do funcionário.
     */
    public String getSenha() {
        return senha;
    }
    /**
     * Define a senha do funcionário.
     * @param senha Estabelece a senha do funcionário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Obtém o cargo do funcionário.
     * @return Retorna o cargo do funcionário.
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * Define o cargo do funcionário.
     * @param cargo Estabelece o cargo do funcionário.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    /**
     * Retorna os dados do funcionário.
     * @return Retorna o "nome" e o "CPF" do funcionário em como uma string.
     */
    @Override
    public String exibirDados(){
       return "Funcionario: " + nome + ", CPF: " + CPF + '}';
    }
    /**
     * Exibe os dados do colaborador como uma string.
     * @return Retorna uma string com os dados do colaborador.
     */
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", senha=" + senha + ", CPF=" + CPF + ", cargo=" + cargo + '}';
    }
}
