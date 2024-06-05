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
import ufvjm.POO.cinema.produtos.Alimento;

/**
 * A classe "JsonAlimentos" é responsável por salvar os alimentos em formato JSON.
 * @author andreleite e andrealexandre
 */
public class JsonAlimentos {
     /**
     * Caminho do arquivo JSON onde os alimentos serão salvos.
     */
    public static final String Alimentos = "/Users/andreleite/Downloads/POO_Cinema_POO/src/main/java/ufvjm/POO/cinema/Json/Alimento.json";
    /**
     * Construtor padrão da classe "JsonAlimentos".
     */
    public JsonAlimentos() {}
     /**
     * Método estático para salvar a lista de alimentos em formato JSON.
     * @param alimento A lista de objetos do tipo Alimento a ser salva.
     */
    public static void salvarAlimentos(List<Alimento> alimento) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(alimento);

        try (FileWriter writer = new FileWriter(Alimentos)) {
            writer.write(json);
            System.out.println("Alimentos salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar alimentos!");
        }
    }
}
