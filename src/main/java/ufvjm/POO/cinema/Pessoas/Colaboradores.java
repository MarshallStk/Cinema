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
     * 
     * @return 
     */
    public String getSenha() {
        return senha;
    }
    /**
     * 
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * 
     * @return 
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * 
     * @param cargo 
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String exibirDados(){
       return "Funcionario: " + nome + ", CPF: " + CPF + '}';
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", senha=" + senha + ", CPF=" + CPF + ", cargo=" + cargo + '}';
    }
}
