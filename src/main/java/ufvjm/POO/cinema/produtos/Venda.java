/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.produtos;
/**
 * A classe "Venda" é utilizada para armazenar as informações de uma compra feita por um cliente.
 * @author andreleite e andrealexandre
 */
public class Venda {
    private String nomeCliente;
        private String nomeFilme;
        private String nomeProduto;
        private final String tipoBalcao;
        private final double valorCompra;
        /**
         * O construtor padrão da classe "Venda".
         * @param nomeCliente atributo utilizado para o nome do cliente.
         * @param nomeFilme atributo utilizado para o filme.
         * @param nomeProduto atributo utilizado para o produto.
         * @param tipoBalcao atributo utilizado para o balcão.
         * @param valorCompra atributo utilizado para o valor da compra.
         */
        public Venda(String nomeCliente, String nomeFilme, String nomeProduto, String tipoBalcao, double valorCompra) {
            this.nomeCliente = nomeCliente;
            this.nomeFilme = nomeFilme;
            this.nomeProduto = nomeProduto;
            this.tipoBalcao = tipoBalcao;
            this.valorCompra = valorCompra;
        }
        /**
         * Obtém o nome do cliente.
         * @return O nome do cliente.
         */
        public String getNomeCliente() {
            return nomeCliente;
        }
        /**
         * Define o nome do cliente.
         * @param nomeCliente Define nome do cliente.
         */
        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }
        /**
         * Obtém o nome do filme.
         * @return Retorna o nome do filme.
         */
        public String getNomeFilme() {
            return nomeFilme;
        }
        /**
         * Define o nome do filme.
         * @param nomeFilme Define o nome do filme.
         */
        public void setNomeFilme(String nomeFilme) {
            this.nomeFilme = nomeFilme;
        }
        /**
         * Obtém o nome do produto.
         * @return Retorna o nome do produto.
         */
        public String getNomeProduto() {
            return nomeProduto;
        }
        /**
         * Define o nome do produto.
         * @param nomeProduto Define o nome do produto.
         */
        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
        }
        /**
         * Obtém o balcão.
         * @return Retorna o balcão.
         */
        public String getTipoBalcao() {
            return tipoBalcao;
        }
        /**
         * Exibe os dados da venda.
         * @return Retorna uma string com os dados da venda.
         */
    @Override
    public String toString() {
        return "Venda{" + "nomeCliente=" + nomeCliente + ", nomeFilme=" + nomeFilme + ", nomeProduto=" + nomeProduto + ", tipoBalcao=" + tipoBalcao + ", valorCompra=" + valorCompra + '}';
    }
        
        
}
