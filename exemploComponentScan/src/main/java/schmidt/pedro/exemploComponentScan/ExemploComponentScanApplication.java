package schmidt.pedro.exemploComponentScan;

import dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dao")
public class ExemploComponentScanApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploComponentScanApplication.class, args);

		ClassDAO objectDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("ObjectDAO: " + objectDAO);

		System.out.println("ObjectJDBC dentro do ObjectDAO: " + objectDAO.getClassJDBC());

	}

}
