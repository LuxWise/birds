package lab5.supertypeimp;

import lab5.superType.TypeSound;
import java.util.logging.Logger;

public class Grasnido implements TypeSound {

    private static final Logger logger = Logger.getLogger(Grasnido.class.getName());

    public void makeSound() {
        logger.info("grasnando");
        System.out.println("grasnando");
    }
}
