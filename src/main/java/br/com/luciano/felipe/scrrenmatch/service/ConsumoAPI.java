package br.com.luciano.felipe.scrrenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    public String obterDados(String endereco) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()!= 200){
                throw new RuntimeException("Erro na requisição HTTP" + response.statusCode());
            }
            return response.body();

        }catch (IOException | InterruptedException e){
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
