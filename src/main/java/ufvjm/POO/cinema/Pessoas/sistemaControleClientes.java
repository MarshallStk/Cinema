/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * A classe "sistemaControleClientes" controla o gerenciamento de clientes no sistema de cinema.
 * Utilizando também, o padrão Singleton para garantir que apenas uma instância exista.
 * @author andreleite e andrealexandre
 */
public class sistemaControleClientes {
    /**
     * ArrayList de clientes a ser criada.
     */
    public ArrayList<Cliente> clientes;
    
    // Instancia Singleton 
    private static final sistemaControleClientes INSTANCE = new sistemaControleClientes();
   /**
    * Construtor privado que evita que a classe seja instanciada fora da classe.
    */
    private sistemaControleClientes() {  // Contrutor private para evitar que ele seja instanciado fora da classe
        this.clientes = new ArrayList<>();
    }
   /**
    * Retorna a instância única da classe "sistemaControleClientes" com a implementação do padrão de projeto Singleton.
    * @return Retorna a instância única da classe.
    */
    // Método publico que libera o acesso a instancia da classe
    public static sistemaControleClientes getInstance() {
        return INSTANCE;
    }
   /**
    * Adiciona o cliente a lista de clientes.
    * @param cliente O cliente a ser adicionado.
    */
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
   /**
    * Retorna o cliente na posição especificada da lista.
    * @param index O índice do cliente a ser retornado.
    * @return Retorna o cliente na posição especificada.
    */
    public Cliente getCliente(int index) {
        return clientes.get(index);
    }
   /**
    * Remove o cliente na posição especificada da lista.
    * @param index O índice do cliente a ser removido. 
    */
    public void removerCliente(int index) {
        clientes.remove(index);
    }
   /**
    * Encontra e retorna o primeiro cliente que atende ao critério do comparador.
    * Este método ordena a lista de clientes de acordo com o comparador fornecido
    * e retorna o primeiro cliente na lista ordenada.
    * @param comparator O comparador usado para ordenar e encontrar o cliente.
    * @return Retorna o primeiro cliente que atende ao critério do comparador, ou null se a lista estiver vazia.
    */
    public Cliente find(Comparator<Cliente> comparator) {
        Collections.sort(clientes, comparator);
        Iterator<Cliente> iterator = clientes.iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
        }
   /**
    * Pesquisa e retorna o cliente com o CPF especificado.
    * @param cpf O CPF do cliente a ser pesquisado.
    * @return Retorna o cliente com o CPF especificado, ou null se não for encontrado.
    */
    public Cliente pesquisarClientePorCPF(String cpf) {
        Iterator<Cliente> iterador = clientes.iterator();
        while (iterador.hasNext()) {
            Cliente cliente = iterador.next();
            if (cliente.getCPF().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
   /**
    * Edita as informações do cliente com o CPF especificado.
    * @param cpf O CPF do cliente a ser editado.
    * @param novoCliente Um objeto Cliente contendo as novas informações.
    */ 
    public void editarClientePorCPF(String cpf, Cliente novoCliente) {
        Iterator<Cliente> iterador = clientes.iterator();

        while (iterador.hasNext()) {
            Cliente cliente = iterador.next();
            if (cliente.getCPF().equals(cpf)) {
                cliente.setNome(novoCliente.getNome());
                cliente.setEndereco(novoCliente.getEndereco());
                cliente.setTelefone(novoCliente.getTelefone());
                System.out.println("Cliente editado com sucesso.\n" + cliente);
            break;
            }
        }
    }
   /**
    * Retorna a lista de todos os clientes.
    * @return Retorna a lista de clientes.
    */
    public ArrayList<Cliente> getClientes() {
    return clientes;
    }
   /**
    * Remove o cliente com o CPF especificado.
    * @param cpf O CPF do cliente a ser removido.
    */
    public void deletarCliente(String cpf) {
        Iterator<Cliente> iterator = this.clientes.iterator();
        
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCPF().equals(cpf)) {
                iterator.remove();
                System.out.println("Cliente removido com sucesso.");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
   /**
    * Retorna uma representação em string do objeto sistemaControleClientes,
    * incluindo as informações de todos os clientes.
    * @return Retorna uma representação em string do objeto sistemaControleClientes.
    */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("SistemaControleCliente {\n");

        for (Cliente cliente : clientes) {
            result.append("  Nome: ").append(cliente.getNome())
                    .append(", CPF: ").append(cliente.getCPF())
                    .append(", Endereço: ").append(cliente.getEndereco())
                    .append(", Telefone: ").append(cliente.getTelefone())
                    .append("\n");
        }

        result.append("}");

        return result.toString();
    }
}