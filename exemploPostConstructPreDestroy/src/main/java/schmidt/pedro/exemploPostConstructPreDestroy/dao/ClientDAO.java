package schmidt.pedro.exemploPostConstructPreDestroy.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import schmidt.pedro.exemploPostConstructPreDestroy.model.Client;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Lombok
@Getter @Setter

//Springboot
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("objeto foi criado!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado!");
    }

}
