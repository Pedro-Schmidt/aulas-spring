package schmidt.pedro.exemploInjecaoDeDependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import schmidt.pedro.exemploInjecaoDeDependencia.interfaces.AnimalInterface;

@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Au auuuu!");
    }

}
