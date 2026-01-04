package academy.devdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"outside.devdojo", "academy.devdojo"})
public class AnimeServiceApplication {

	public static void main(String[] args) {
		// Sempre colocar a classe ServiceApplication na raiz do pacote, nesse caso, "academy.devdojo"

		// Mostra todos os beans que todas as vezes que eu Starto o Servlet Container ele está carregando para mim
		// Se procurar eu tenho o HelloController

		// O que acontece se eu criar outro pacote?
		// Ele não vai encontrar porque ele não vai reconhecer esse bean, então precisa fazer outra coisa primeiro
		// @ComponentScan(basePackages = "outside.devdojo") << Todas as vezes que a aplicação rodar ele vai scanear
		// os pacotes a partir de "outside.devdojo"
		// O "OutsideController" vai funcionar, mas o "HelloController" vai parar, porque eu sobrescrevi o comportamento
		// do ComponentScan
		// Então eu preciso fazer o seguinte para ambos funcionarem, lembrando que "basePackages" é um Array
		// @ComponentScan(basePackages = {"outside.devdojo", "academy.devdojo"})
        var applicationContext = SpringApplication.run(AnimeServiceApplication.class, args);
		Arrays.stream(applicationContext.getBeanDefinitionNames())
				.forEach(System.out::println);
	}

}
