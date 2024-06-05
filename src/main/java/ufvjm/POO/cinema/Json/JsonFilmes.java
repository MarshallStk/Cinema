/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufvjm.POO.cinema.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import ufvjm.POO.cinema.produtos.Filme;

/**
 * A classe "JsonFilmes" é responsável por salvar os filmes em formato JSON.
 * @author andreleite e andrealexandre
 */
public class JsonFilmes {
     /**
     * Caminho do arquivo JSON onde os filmes serão salvos.
     */
    public static final String Filmes = "/Users/andreleite/Downloads/POO_Cinema_POO/src/main/java/ufvjm/POO/cinema/Json/Filme.json";
    /**
     * Construtor padrão da classe "JsonFilmes".
     */
    public JsonFilmes() {}
   /**
     * Método estático para salvar a lista de filmes em formato JSON.
     * @param filmes A lista de objetos do tipo Filme a ser salva.
     */
    public static void salvarFilmes(List<Filme> filmes) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(filmes);

        try (FileWriter writer = new FileWriter(Filmes)) {
            writer.write(json);
            System.out.println("Filmes salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar filmes!");
        }
    }
}
