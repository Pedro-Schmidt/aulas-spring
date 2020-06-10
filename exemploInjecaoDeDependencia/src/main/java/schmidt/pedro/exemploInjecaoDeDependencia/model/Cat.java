package schmidt.pedro.exemploInjecaoDeDependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import schmidt.pedro.exemploInjecaoDeDependencia.interfaces.AnimalInterface;

@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("miauuuu");
    }

}
