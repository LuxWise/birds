package lab5.supertypeimp;

import lab5.superType.TypeSound;
import java.util.logging.Logger;

public class DontSing implements TypeSound {

    private static final Logger logger = Logger.getLogger(DontSing.class.getName());

    public void makeSound() {
        logger.info("<<silence>>");
        System.out.println("<<silence>>");
    }
}
