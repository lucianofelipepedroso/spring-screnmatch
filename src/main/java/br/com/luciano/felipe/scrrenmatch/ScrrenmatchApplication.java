package br.com.luciano.felipe.scrrenmatch;

import br.com.luciano.felipe.scrrenmatch.model.DadosSerie;
import br.com.luciano.felipe.scrrenmatch.service.ConsumoAPI;
import br.com.luciano.felipe.scrrenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrrenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScrrenmatchApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI api = new ConsumoAPI();
		ConverterDados converterDados = new ConverterDados();
		String json = api.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		DadosSerie dadosSerie = converterDados.obterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);


	}
}
