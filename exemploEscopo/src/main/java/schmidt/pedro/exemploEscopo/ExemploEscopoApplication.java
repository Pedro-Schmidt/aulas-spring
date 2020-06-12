package schmidt.pedro.exemploEscopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import schmidt.pedro.exemploEscopo.dao.ClassDAO;
import schmidt.pedro.exemploEscopo.dao.ClassJDBC;

@SpringBootApplication
public class ExemploEscopoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploEscopoApplication.class, args);

		ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);

		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
		ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Obj da classe JDBC: " + objJDBC);
		System.out.println("Obj da classe JDBC1: " + objJDBC1);

		System.out.println("Obj da classe DAO: " + objDAO);
		System.out.println("Obj da classe DAO1: " + objDAO1);

	}

}
