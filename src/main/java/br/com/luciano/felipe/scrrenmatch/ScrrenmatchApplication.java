package br.com.luciano.felipe.scrrenmatch;

import br.com.luciano.felipe.scrrenmatch.service.ConsumoAPI;
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
		String json = api.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		json = api.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);

	}
}
