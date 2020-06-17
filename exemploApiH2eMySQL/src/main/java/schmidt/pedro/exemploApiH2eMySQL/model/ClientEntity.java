package schmidt.pedro.exemploApiH2eMySQL.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//Lombok
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//Springboot
@Component

//JPA
@Entity
@Table(name = "cliente")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @NotBlank(message = "nao pode nulo nem em branco")
    @Column(name = "nome")
    private String name;

    @NotNull(message = "nao pode income")
    @Column(name = "renda")
    private double income;

}
