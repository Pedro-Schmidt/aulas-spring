package schmidt.pedro.exemploPostConstructPreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import schmidt.pedro.exemploPostConstructPreDestroy.dao.ClientDAO;
import schmidt.pedro.exemploPostConstructPreDestroy.model.Client;

@SpringBootApplication
public class ExemploPostConstructPreDestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploPostConstructPreDestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Cleber","Oliveira"));

		System.out.println("ClientDAO: " + clientDAO);
		System.out.println("ClientDAO: " + clientDAO.getClient().toString());

	}

}
