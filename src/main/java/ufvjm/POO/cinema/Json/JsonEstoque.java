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
import ufvjm.POO.cinema.produtos.Estoque;


/**
 * A classe "JsonEstoque" é responsável por salvar os produtos em geral em formato JSON.
 * @author andreleite
 */
public class JsonEstoque {
     /**
     * Caminho do arquivo JSON onde os alimentos e filmes serão salvos.
     */
    public static final String Estoque = "/Users/andreleite/Downloads/POO_Cinema_POO/src/main/java/ufvjm/POO/cinema/Json/Estoque.json";
    /**
     * Construtor padrão da classe "Estoque".
     */
    public JsonEstoque() {}
      /**
     * Método estático para salvar a lista de estoques em formato JSON.
     * @param estoque A lista de objetos do tipo Estoque a ser salva.
     */
    public static void salvarEstoque(List<Estoque> estoque) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(estoque);

        try (FileWriter writer = new FileWriter(Estoque)) {
            writer.write(json);
            System.out.println("Estoque salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar estoques!");
        }
    }
}
