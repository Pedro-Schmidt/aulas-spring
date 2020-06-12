package schmidt.pedro.exemploPostConstructPreDestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

//Lombok
@ToString
@Getter @Setter
@AllArgsConstructor

//Springboot
@Component
public class Client {

    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe cliente");
    }
}
