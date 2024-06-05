/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.Pessoas;

import java.util.Comparator;

/**
 * A classe "ComparatorNomeCliente" é utilizada para comparar o nome de dois clientes e retornar a diferença entre as strings.
 * @author andreleite e andrealexandre
 */
public class ComparatorNomeCliente implements Comparator<Cliente>{
    /**
     * É o método utilizado para comparar os nomes dos clientes.
     * @param c1 Recebe o nome cliente 1.
     * @param c2 Recebe o nome do cliente 2.
     * @return Retorna a comparação do nome dos dois clientes utilizados.
     */
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return compareStrings(c1.getNome(), c2.getNome());
    }
    /**
     * É um método utilizado para comparar o nome de dois clientes.
     * @param s1 Recebe a string do primeiro nome.
     * @param s2 Recebe a string do segundo nome.
     * @return Retorna a diferença dos comprimentos em strings.
     */
    private static int compareStrings(String s1, String s2) {
        int len1 = s1.length();// Recebe o comprimento da primeira string
        int len2 = s2.length();// Recebe o comprimento da segunda string
        int lim = Math.min(len1, len2);// Determina o menor comprimento entre as duas strings

        for (int i = 0; i < lim; i++) {// Percorre pelos caracteres das duas strings até o menor comprimento
            char c1 = s1.charAt(i);// Recebe o caractere na posição i da primeira string
            char c2 = s2.charAt(i);// Recebe o caractere na posição i da segunda string
            if (c1 != c2) {// Compara os caracteres; se forem diferentes, retorna a diferença
                return c1 - c2;
            }
        }
        // Se todos os caracteres até o menor comprimento são iguais,
        // retorna a diferença dos comprimentos das strings
        return len1 - len2;
    }    
}
