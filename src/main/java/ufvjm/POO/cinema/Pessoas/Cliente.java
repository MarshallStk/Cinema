/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.Pessoas;
/**
 *  A classe "Cliente" é utilizada para representar o objeto "Cliente", sendo uma extensão da classe "Pessoa".
 *  @author andreleite e andrealexandre
 */
public class Cliente extends Pessoa{
    private String sobrenome;
    private String endereco;
    private String telefone;
    private String PrefFilmes;
    private String PrefProduto;
    private double compras;
    /**
    * Método estático do tipo private utilizado para retornar quantas instâncias foram criadas para os tipos "Cliente".
    */
    private static int contadorClientesEncapsulado = 0;//Variável privada para contagem utilizando encapsulamento.
    /**
    * Método estático do tipo protected utilizado para retornar quantas instâncias foram criadas para os tipos "Cliente".
    */
    protected static int contadorClientesProtected = 0;// Variável protegida para contagem
    /**
    * Método estático utilizado para retornar quantas instâncias foram criadas para os tipos "Cliente".
    */
    private static int contadorCliente = 0;//Variável estática simples para contagem.
    /**
     * O construtor da classe "Cliente" que é utitilizado para criar um cliente.
     * @param nome O nome do cliente.
     * @param sobrenome O sobrenome do cliente.
     * @param CPF O CPF do cliente.
     * @param endereco O endereço do cliente.
     * @param telefone O telefone do cliente.
     * @param PrefFilmes A preferência de filme.
     * @param PrefProduto A preferênia do produto.
     * @param compras O valor total consumido no cinema.
     */
    public Cliente(String nome, String sobrenome, String CPF, String endereco, String telefone, String PrefFilmes, String PrefProduto, double compras) {
        super(nome, CPF);
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.compras = compras;
        this.PrefFilmes = PrefFilmes;
        this.PrefProduto = PrefProduto;
         
        
        //Incrementa os contadores sempre que uma nova instância de Cliente é criada
        /**
         * Método estático do tipo private utilizado para retornar quantas instâncias foram criadas para os tipos "Cliente".
         */
        contadorClientesEncapsulado++;
        /**
         * Método estático do tipo protected utilizado para retornar quantas instâncias foram criadas para os tipos "Cliente".
         */
        contadorClientesProtected++;
        /**
         * Método estático utilizado para retornar quantas instâncias foram criadas para os tipos "Cliente".
         */
        contadorCliente++;
        
    }
    /**
     * Obtém o contador dos clientes privados.
     * @return Retorna o contador dos clientes.
     */
    public static int getContadorClientesEncapsulado() {
        return contadorClientesEncapsulado;
    }
    /**
     * Obtém o contador dos clientes protegidos.
     * @return Retorna o contador dos clientes.
     */
    public static int getContadorClientesProtected() {
        return contadorClientesProtected;
    }
    /**
     * Obtém o contador dos clientes públicos.
     * @return Retorna o contador dos cliente.
     */
    public static int getContadorCliente() {
        return contadorCliente;
    }
    /**
     * Obtém o sobrenome do cliente.
     * @return Retorna o sobrenome do cliente.
     */
    public String getSobrenome() {
        return sobrenome;
    }
    /**
     * Define o sobrenome do cliente.
     * @param sobrenome Estabelece o sobrenome do cliente.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    /**
     * Obtém o endereço do cliente.
     * @return Retorna o endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * Define o endereço do cliente.
     * @param endereco Estabelece o endereço do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * Obtém o telefone do cliente.
     * @return Retorna o telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * Define o telefone do cliente.
     * @param telefone Estabelece o telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    /**
     * Obtém o filme preferido do cliente.
     * @return Retorna o filme preferido do cliente.
     */
    public String getPrefFilmes() {
        return PrefFilmes;
    }
    /**
     * Define o filme preferido do cliente.
     * @param PrefFilmes Estabelece o filme preferido do cliente.
     */
    public void setPrefFilmes(String PrefFilmes) {
        this.PrefFilmes = PrefFilmes;
    }
    /**
     * Obtém a informação do produto preferido do cliente.
     * @return Retorna o produto preferido.
     */
    public String getPrefProduto() {
        return PrefProduto;
    }
    /**
     * Define a preferência do produto do cliente.
     * @param PrefProduto Estabelece a preferência do produto do cliente.
     */
    public void setPrefProduto(String PrefProduto) {
        this.PrefProduto = PrefProduto;
    }
    /**
     * Obtém o valor total das compras do cliente.
     * @return Retorna o valor total das compras.
     */
    public double getCompras() {
        return compras;
    }
    /**
     * Define o valor total das compras feitas pelo cliente.
     * @param compras Estabelece o novo valor das compras.
     */
    public void setCompras(double compras) {
        this.compras = compras;
    }
    /**
     * O método soma o valor das compras de cada produto.
     * @param valor O valor total das compras.
     */
    public void adicionarCompras(Double valor) {
        this.compras += valor;
    }
    /**
     * O método cancela as compras cancela as compras do cliente retornando 75% do valor do pedido.
     * @param valor O valor que será retornado.
     */
    public void cancelarCompras(Double valor) {
        this.compras -= (0.75 * valor);
    }
    /**
     * Retorna uma representação em string do cliente.
     * @return Retorna uma string representando o cliente.
     */
    @Override
    public String toString() {
        return "Cliente{ Nome=" + nome + ", sobrenome=" + sobrenome + ", Valor Gasto: " + compras + ", endereco=" + endereco + ", telefone=" + telefone + ", PrefFilmes=" + PrefFilmes + ", PrefProduto=" + PrefProduto + ", ID=" + contadorCliente + '}';
    }
    /**
     * Exibe os dados do cliente.
     * @return uma string com os dados do cliente.
     */
    @Override
    public String exibirDados(){
       return "Cliente: " + nome + ", CPF: " + CPF + '}';
   }
    
}
    