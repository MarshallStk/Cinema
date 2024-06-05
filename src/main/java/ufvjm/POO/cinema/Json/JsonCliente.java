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
import ufvjm.POO.cinema.Pessoas.Cliente;
    /**
     * A classe "JsonCliente" é responsável por salvar os clientes em formato JSON.
     * @author andreleite e andrealexandre
     */
public class JsonCliente {
    /**
     * Caminho do arquivo JSON onde os clientes serão salvos.
     */
public static final String Cliente = "/Users/andreleite/Downloads/POO_Cinema_POO/src/main/java/ufvjm/POO/cinema/Json/Cliente.json";
    /**
     * Construtor padrão da classe "JsonCliente".
     */
    public JsonCliente () {}
    /**
     * Método estático para salvar a lista de clientes em formato JSON.
     * @param clientes A lista de objetos do tipo Cliente a ser salva.
     */
    public static void salvarClientes(List<Cliente> clientes) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(clientes);

        try (FileWriter writer = new FileWriter(Cliente)) {
            writer.write(json);
            System.out.println("Clientes salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar clientes!");
        }
    }
}