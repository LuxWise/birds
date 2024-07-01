package lab4.supertypeimp;

import lab4.superType.TypeFlight;
import java.util.logging.Logger;

public class DontFlight implements TypeFlight {

    private static final Logger logger = Logger.getLogger(DontSing.class.getName());

    public void flight() {
        logger.info("you can't flight");
        System.out.println("you can't flight");
    }
}
