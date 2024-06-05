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
import ufvjm.POO.cinema.Pessoas.Colaboradores;


/**
 * A classe "JsonColaboradores" é responsável por salvar os colaboradores em formato JSON.
 * @author andreleite e andrealexandre
 */
public class JsonColaboradores {
     /**
     * Caminho do arquivo JSON onde os colaboradores serão salvos.
     */
    public static final String Colaboradores = "/Users/andreleite/Downloads/POO_Cinema_POO/src/main/java/ufvjm/POO/cinema/Json/Colaboradores.json";
    /**
     * Construtor padrão da classe "Colaboradores".
     */
    public JsonColaboradores() {}
     /**
     * Método estático para salvar a lista de colaboradores em formato JSON.
     * @param colaboradores A lista de objetos do tipo Colaboradores a ser salva.
     */
    public static void salvarColaboradores(List<Colaboradores> colaboradores) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(colaboradores);

        try (FileWriter writer = new FileWriter(Colaboradores)) {
            writer.write(json);
            System.out.println("Colaboradores salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar colaboradores!");
        }
    }
}
