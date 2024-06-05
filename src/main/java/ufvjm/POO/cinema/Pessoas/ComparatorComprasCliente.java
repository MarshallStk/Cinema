/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.Pessoas;

import java.util.Comparator;

/**
 * A classe "ComparatorComprasCliente é utilizada para comparar o nome de dois clientes e ordenalos em ordem alfabética,
 * e comparar as compras e ordenar pelo valor.
 * @author andreleite e andrealexandre
 */
public class ComparatorComprasCliente implements Comparator<Cliente>{
    /**
     * Método utilizado para comparar os clientes selecionados e retornar os valores gastos de forma ordenada.
     * @param c1 Primeiro cliente selecionado.
     * @param c2 Segundo cliente selecionado.
     * @return Os clientes em ordem.
     */
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return compareCompras(c1.getCompras(), c2.getCompras());    
    }
    /**
     * 
     * @param v1 Valor gasto do primeiro cliente.
     * @param v2 Valor gasto do segundo cliente.
     * @return Valores ordenados.
     */
    private static int compareCompras(double v1, double v2) {
        // Compara os valores gastos dos clientes
        if (v1 < v2) {
            return -1;
        } else if (v1 > v2) {
            return 1;
        } else {
            return 0;
        }
    }
}