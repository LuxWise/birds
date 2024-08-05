package lab5.supertypeimp;

import lab5.superType.TypeFlight;
import java.util.logging.Logger;

public class Flight implements TypeFlight {

    private static final Logger logger = Logger.getLogger(Flight.class.getName());

    public void flight() {
        logger.info("Fligthing");
        System.out.println("Fligthing");
    }
}
