/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.produtos;

import java.util.Comparator;

/**
 * A classe "compararValorFilme" é utilizada para comparar os preços dos ingressos de cada filme.
 * @author andreleite e andrealexandre
 */

public class compararValorFilme implements Comparator<Filme>{
    /**
     * O método compare é utilizado para comparar os dois valores.
     * @param o1 O valor do ingresso do primeiro filme.
     * @param o2 O valor do ingresso do segundo filme.
     * @return Retorna os valores em ordem crescente.
     */
    @Override
    public int compare(Filme o1, Filme o2) {
        double diferencaValor = o1.getValor() - o2.getValor();
          // Se a diferença for diferente de zero, retorna a diferença;      
        if (diferencaValor > 0) {
            return 1;
        } else if (diferencaValor < 0) {
            return -1;
        }
         // Retorna 0 se tiverem o mesmo valor       
        return 0;    }
}
