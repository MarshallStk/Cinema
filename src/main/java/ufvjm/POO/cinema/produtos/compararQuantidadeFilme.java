/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.produtos;

import java.util.Comparator;

/**
 * A classe "comparaQuantidadeFilme" é utilizada para comparar quantos assentos existem em cada sala em ordem crescente.
 * @author andreleite e andrealexandre
 */
public class compararQuantidadeFilme implements Comparator<Filme>{
    /**
     * Comparar dois filmes com base nos números de assentos disponíveis.
     * @param o1 Quantidade de assentos da sala do primeiro filme.
     * @param o2 Quantidade de assentos da sala do segundo filme.
     * @return Retorna as salas em ordem crescente.
     */
    @Override
    public int compare(Filme o1, Filme o2) {
        double diferencaValor = o1.getAssentos() - o2.getAssentos();
          // Se a diferença for diferente de zero, retorna a diferença;      
        if (diferencaValor > 0) {
            return 1;
        } else if (diferencaValor < 0) {
            return -1;
        }
         // Retorna 0 se tiverem o mesmo valor       
        return 0;    }
}
