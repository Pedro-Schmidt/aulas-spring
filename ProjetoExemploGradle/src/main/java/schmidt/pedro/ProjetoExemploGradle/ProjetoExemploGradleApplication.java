package schmidt.pedro.ProjetoExemploGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import schmidt.pedro.ProjetoExemploGradle.model.Aluno;

@SpringBootApplication
public class ProjetoExemploGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoExemploGradleApplication.class, args);
		System.out.println("Hello World!");
		System.out.println(new Aluno(8.9,9.9));
	}

}
