/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.produtos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ufvjm.POO.cinema.Pessoas.Cliente;

/**
 * A classe "GerenciamentoVendas" tem como utilidade monitorar e gerenciar as vendas dos produtos em geral.
 * @author andreleite e andrealexandre
 */
 
public class GerenciamentoVendas {
    private double vendaFilme;
    private double vendasProdutos;
    private double totalVenda;
    private final List<Venda> vendas;
    
    private static List<Double> balcao1 = new ArrayList<>();
    private static List<Double> balcao2 = new ArrayList<>();
    private static List<Double> balcao3 = new ArrayList<>();
    private static List<Double> balcao4 = new ArrayList<>();
    private static List<Double> balcaoAutomatico = new ArrayList<>();
    
    
    // instância Singleton
    private static volatile GerenciamentoVendas instance;
    
    /**
     * Construtor privado para inicializar as vendas.
     * Este construtor é chamado internamente para garantir que as vendas sejam inicializadas de forma correta.
    */
    private GerenciamentoVendas(){
        this.totalVenda=0;
        this.vendaFilme=0;
        this.vendasProdutos=0;
        this.vendas = new ArrayList<>();
    }
    
    // Método público para fornecer acesso à instância
    
    /**
    * Obtém a instância única de GerenciamentoVendas.
    * Se a instância ainda não existir, uma nova será criada.
    * @return A instância única de GerenciamentoVendas.
    */
    public static GerenciamentoVendas getInstance() {
        GerenciamentoVendas instance = GerenciamentoVendas.instance;
        if (instance == null) {
            synchronized (GerenciamentoVendas.class) {
                instance = GerenciamentoVendas.instance;
                if (instance == null) {
                    GerenciamentoVendas.instance = instance = new GerenciamentoVendas();
                }
            }
        }
        return instance;
    }
    /**
     * Obtém o valor total das vendas dos filmes.
     * @return Retorna o valor das vendas dos filmes. 
     */
    public double getVendaFilme() {
        return vendaFilme;
    }
    /**
     * Define o valor total das vendas dos filmes.
     * @param vendaFilme Estabelece o valor total das vendas dos filmes
     */
    public void setVendaFilme(double vendaFilme) {
        this.vendaFilme = vendaFilme;
    }
    /**
     * Obtém o valor total das vendas dos produtos.
     * @return Retorna o valor total das vendas dos produtos.
     */
    public double getVendasProdutos() {
        return vendasProdutos;
    }
    /**
     * Define o valor total das vendas dos produtos.
     * @param vendasProdutos Estabelece o valor total das vendas dos produtos.
     */
    public void setVendasProdutos(double vendasProdutos) {
        this.vendasProdutos = vendasProdutos;
    }
    /**
     * Obtém o valor total das vendas.
     * @return Retorna o valor total das vendas.
     */
    public double getTotalVenda() {
        return totalVenda;
    }
    /**
     * Define o valor total das vendas.
     * @param totalVenda Estabelece o valor total das vendas.
     */
    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }
    /**
     * Neste método, será atribuido o cliente os produtos que ele está comprando.
     * @param cliente O cliente que está realizando a compra.
     * @param filme O filme para o qual os ingressos estão sendo comprados.
     * @param alimento O alimento sendo comprado.
     * @param quantidadeAssentos A quantidade de assentos comprados para o filme.
     * @param quantidadeAlimentos A quantidade de alimentos comprados.
     * @param valorFilme O valor unitário de cada ingresso do filme.
     * @param valorAlimento O valor unitário de cada alimento.
     * @param tipoBalcao Qual balcão está sendo realizada a venda.
     */
  public void realizarCompra(Cliente cliente, Filme filme, Alimento alimento, int quantidadeAssentos,int quantidadeAlimentos, double valorFilme, double valorAlimento, String tipoBalcao){
        double vendasFilme = calcularValorTotal(quantidadeAssentos, valorFilme);
        double vendaAliementos = calcularValorTotal(quantidadeAlimentos, valorAlimento);
        double valorTotal = (quantidadeAssentos * valorFilme) + (quantidadeAlimentos * valorAlimento);
        
        int assentosAtuais = filme.getAssentos() - quantidadeAssentos;
        int quantidadeAtuais = alimento.getQuantidade() - quantidadeAlimentos;
        
        
        cliente.adicionarCompras(valorTotal);
        
        switch (tipoBalcao) {
            case "Balcao 1":
                balcao1.add((double) (vendasFilme + vendaAliementos));
                break;
            case "Balcao 2":
                balcao2.add((double) (vendasFilme + vendaAliementos));
                break;
            case "Balcao 3":
                balcao3.add((double) (vendasFilme + vendaAliementos));
                break;
            case "Balcao 4":
                balcao4.add((double) (vendasFilme + vendaAliementos));
                break;
            case "Balcao Automatico":
                balcaoAutomatico.add((double) (vendasFilme + vendaAliementos));
                break;
        default:
            System.out.println("Tipo de balcao inválido.");
    }
        this.totalVenda += valorTotal;
        this.vendaFilme += vendasFilme;
        this.vendasProdutos += vendaAliementos;
                   
            System.out.println("Nome do Cliente: " + cliente.getNome());
            System.out.println("Nome do Filme: " + filme.getNome());
            System.out.println("Nome do Produto: " + alimento.getNome());
            System.out.println("Tipo do Balcao Usado: " + tipoBalcao);
            System.out.println("Valor da Compra: " + valorTotal);
            System.out.println();
            
        Venda venda = new Venda(cliente.getNome(), filme.getNome(), alimento.getNome(), tipoBalcao, valorTotal);
        this.vendas.add(venda);
        
        filme.setAssentos(assentosAtuais);
        alimento.setQuantidade(quantidadeAtuais);
    }
    /**
     * Obtem a lsita de venda.
     * @return Retorna a lista de venda registrada.
     */        
    public List<Venda> listaVenda(){
        return this.vendas;
    }
    /**
     * Emite um total de vendas para algum dos balcões.
     * @param tipoBalcao O tipo de balcão para o qual o total de vendas será emitido.
     */   
    public void emitirTotalVendasBalcao(String tipoBalcao) {
    List<Double> balcaoSelecionado = null;
    // Verifica o tipo de balcao e seleciona a lista correspondente
    switch (tipoBalcao) {
    case "Balcao 1":
        balcaoSelecionado = balcao1;
        break;
    case "Balcao 2":
        balcaoSelecionado = balcao2;
        break;
    case "Balcao 3":
        balcaoSelecionado = balcao3;
        break;
    case "Balcao 4":
        balcaoSelecionado = balcao4;
        break;
    case "Balcao Automatico":
        balcaoSelecionado = balcaoAutomatico;
        break;
    default:
        System.out.println("Tipo de balcao inválido.");
    }
    // Se a lista do balcao selecionado não for nula, calcula e exibe o total de vendas
    if (balcaoSelecionado != null) {
        double totalVendasBalcao = balcaoSelecionado.stream().mapToDouble(Double::doubleValue).sum();
            System.out.println("Total de Vendas do Balcao " + tipoBalcao + ": " + totalVendasBalcao);
        }
    }
    /**
     * Método para calcular o valor total de cada produto.
     * @param quantidade A quantidade de cada item.
     * @param valorUnitario O valor de cada item.
     * @return Retorna o valor total calculado.
     */
    public double calcularValorTotal(int quantidade, double valorUnitario){
        return (double) (quantidade * valorUnitario);
    }
    /**
     * Atualiza o total das vendas somando filmes e alimentos.
     * O valor é armazenado em "totalVenda".
     */
    public void guardarVendas(){
        this.totalVenda = this.vendaFilme +  this.vendasProdutos;
    }
    /**
     * Emite um relatório de tudo que foi vendido.
     * As informações são obtidas após a atualização das vendas e a impressão dos resultados.
     */
    public void emitirRelatorioVenda() {
        this.guardarVendas();
        System.out.println("Venda de Filmes: " + this.vendaFilme);
        System.out.println("Vendas de Produtos: " + this.vendasProdutos);
        System.out.println("Total Diário: " + this.totalVenda);
    }
    /**
     * Calcula o total das vendas de um balcão.
     * @param balcao A lista de valores para o balcão.
     * @return O total de vendas para o balcão.
     */      
    public double calcularTotalBalcao(List<Double> balcao) {
        return balcao.stream().mapToDouble(Double::doubleValue).sum();
    }
    /**
     * Calcula o total das vendas para um determinado balcão.
     * Este método é utilizado internamente para calcular o total das vendas.
     * @param balcao A lista de valores das vendas para o balcão.
     * @return O total das vendas para o balcão.
     */
    private double calcularTotalVendas(List<Double> balcao) {
        return balcao.stream().mapToDouble(Double::doubleValue).sum();
    }
     /**
     * Exibe as vendas ordenadas em ordem decrescente para um determinado tipo de balcão.
     * @param tipoBalcao O tipo de balcão para o qual as vendas serão exibidas.
     */
    private void exibirVendasOrdenadas(String tipoBalcao) {
                // Obtém a lista de vendas do tipo de balcao selecionado
        List<Double> vendas = obterListaPorTipoBalcao(tipoBalcao);
        vendas.sort(Comparator.reverseOrder()); // Ordena as vendas em ordem decrescente
                 // Exibe as vendas ordenadas
        System.out.println("\nTipo do Balcao Usado: " + tipoBalcao);
        System.out.println("Vendas Ordenadas:");
        for (Double venda : vendas) {
        System.out.println("Valor da Compra: " + venda);
        }
    }
    /**
     * Compara as vendas entre dois tipos de balcão, exibindo as vendas ordenadas para o balcão com o maior valor total.
     * @param tipoBalcao1 O tipo de balcão para o primeiro conjunto de vendas.
     * @param tipoBalcao2 O tipo de balcão para o segundo conjunto de vendas.
     */
    public void compararVendas(String tipoBalcao1, String tipoBalcao2) {
        // Instancia um comparador de balcoes (não fornecido no código fornecido)
        comparatorBalcao comparador = new comparatorBalcao();
         // Obtém a lista de vendas para cada tipo de balcao
        List<Double> vendasBalcao1 = obterListaPorTipoBalcao(tipoBalcao1);
        List<Double> vendasBalcao2 = obterListaPorTipoBalcao(tipoBalcao2);
         // Calcula o total de vendas para cada balcao
        double totalBalcao1 = calcularTotalVendas(vendasBalcao1);
        double totalBalcao2 = calcularTotalVendas(vendasBalcao2);
         // Exibe a comparação dos balcoes com base no balcao de maior valor total
        System.out.println("Comparação dos balcoes levando em conta o balcao que teve o maior valor total.");
        System.out.println("Total " + tipoBalcao1 + " = " + totalBalcao1 + "\nTotal " + tipoBalcao2 + " = " + totalBalcao2);
        System.out.println("\nOrdenação de compras dos balcao usados na comparação.");

          // Exibe as vendas ordenadas dos balcoes com base no maior valor total
        if (totalBalcao1 > totalBalcao2) {
            exibirVendasOrdenadas(tipoBalcao1);
            exibirVendasOrdenadas(tipoBalcao2);
        } else {
            exibirVendasOrdenadas(tipoBalcao2);
            exibirVendasOrdenadas(tipoBalcao1);
        }
    }
    /**
     * Obtém a lista de vendas para um determinado tipo de balcão.
     * @param tipoBalcao O tipo de balcão para o qual a lista de vendas será obtida.
     * @return A lista de vendas para o tipo de balcão especificado, ou uma lista vazia se o tipo de balcão for inválido.
     */
     private List<Double> obterListaPorTipoBalcao(String tipoBalcao) {
        switch (tipoBalcao) {
            case "Balcao 1":
                return balcao1;
            case "Balcao 2":
                return balcao2;
            case "Balcao 3":
                return balcao3;
            case "Balcao 4":
                return balcao4;
            case "Balcao Automatico":
                return balcaoAutomatico;
            default:
            System.out.println("Tipo de balcao inválido.");
             return new ArrayList<>();
        }
    }
     /**
     * Calcula e exibe o balanço mensal das vendas de todos os tipos de balcão.
     * O balanço mensal é a soma total das vendas de todos os balcões.
     */
     public void BalancoMensal(){
        System.out.println("Balanço mensal");
        
        System.out.println(
                calcularTotalBalcao(balcao1)+ 
                calcularTotalBalcao(balcao2)+ 
                calcularTotalBalcao(balcao3)+ 
                calcularTotalBalcao(balcao4)+
                calcularTotalBalcao(balcaoAutomatico)
        );  
     }
    /**
     * Retorna uma representação em string do objeto GerenciamentoVendas, incluindo vendas de filmes, vendas de produtos,
     * total diário de vendas e totais de vendas para cada tipo de balcão.
     * @return Retorna uma string string do objeto GerenciamentoVendas.
     */
    @Override
    public String toString() {
      // Formata a string com os valores das vendas e totais dos balcoess
        return String.format("GerenciamentoVendas {" +
        " Vendas de Filmes =%.2f," +
        " Vendas de Produtos =%.2f," +
        " Total Diário =%.2f," +
        " Total Balcao 1 =%.2f," +
        " Total Balcao 2 =%.2f," +
        " Total Balcao 3 =%.2f," +
        " Total Balcao 4 =%.2f," +
        " Total Balcao Automatico =%.2f" +
        "}",
        this.vendaFilme,
        this.vendasProdutos,
        this.totalVenda,
        calcularTotalBalcao(balcao1),
        calcularTotalBalcao(balcao2),
        calcularTotalBalcao(balcao3),
        calcularTotalBalcao(balcao4),
        calcularTotalBalcao(balcaoAutomatico));
        
        }
}
