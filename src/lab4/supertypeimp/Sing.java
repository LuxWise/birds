package lab4.supertypeimp;

import lab4.superType.TypeSound;
import java.util.logging.Logger;

public class Sing implements TypeSound {

    private static final Logger logger = Logger.getLogger(Sing.class.getName());

    public void makeSound() {
        logger.info("Sing");
        System.out.println("Sing");
    }
}
