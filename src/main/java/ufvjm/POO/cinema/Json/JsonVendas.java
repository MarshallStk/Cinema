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
import ufvjm.POO.cinema.produtos.Venda;

/**
 * A classe "JsonVendas" é responsável por salvar os clientes em formato JSON.
 * @author andreleite
 */
public class JsonVendas {
     /**
     * Caminho do arquivo JSON onde os vendas serão salvos.
     */
    public static final String Vendas = "/Users/andreleite/Downloads/POO_Cinema_POO/src/main/java/ufvjm/POO/cinema/Json/Vendas.json";
    /**
     * Construtor padrão da classe "JsonVendas".
     */
    public JsonVendas() {}
     /**
     * Método estático para salvar a lista de vendas em formato JSON.
     * @param vendas A lista de objetos do tipo Venda a ser salva.
     */
    public static void salvarVendas(List<Venda> vendas) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(vendas);

        try (FileWriter writer = new FileWriter(Vendas)) {
            writer.write(json);
            System.out.println("Vendas salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar vendas!");
        }
    }
}
