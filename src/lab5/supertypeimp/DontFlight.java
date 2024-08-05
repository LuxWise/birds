package lab5.supertypeimp;

import lab5.superType.TypeFlight;
import java.util.logging.Logger;

public class DontFlight implements TypeFlight {

    private static final Logger logger = Logger.getLogger(DontSing.class.getName());

    public void flight() {
        logger.info("you can't flight");
        System.out.println("you can't flight");
    }
}
