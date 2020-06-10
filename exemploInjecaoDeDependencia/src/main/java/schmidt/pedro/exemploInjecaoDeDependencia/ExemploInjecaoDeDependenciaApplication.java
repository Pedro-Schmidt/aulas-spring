package schmidt.pedro.exemploInjecaoDeDependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploInjecaoDeDependenciaApplication {

	public static void main(String[] args) {

//		3 maneira
		ApplicationContext applicationContext = SpringApplication.run(ExemploInjecaoDeDependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

//		1 maneira - acoplado
//		Pet pet = new Pet();
//		pet.execute();

//		2 maneira - menos acoplado
//		Pet pet = new Pet(new Dog());
//		pet.execute();
//
//		Pet pet = new Pet(new Cat());
//		pet.execute();

	}

}
