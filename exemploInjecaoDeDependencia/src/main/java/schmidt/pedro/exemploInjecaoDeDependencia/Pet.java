package schmidt.pedro.exemploInjecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import schmidt.pedro.exemploInjecaoDeDependencia.interfaces.AnimalInterface;
import schmidt.pedro.exemploInjecaoDeDependencia.model.Dog;

@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

//    /**
//     *
//     * @param animalInterface
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }

    public void execute() {
        animalInterface.comunicar();
    }

//    public void execute() {
//        animalInterface = new Dog();
//        animalInterface.comunicar();
//    }

}
