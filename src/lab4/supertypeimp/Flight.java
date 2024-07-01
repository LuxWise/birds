package lab4.supertypeimp;

import lab4.superType.TypeFlight;
import java.util.logging.Logger;

public class Flight implements TypeFlight {

    private static final Logger logger = Logger.getLogger(Flight.class.getName());

    public void flight() {
        logger.info("Fligthing");
        System.out.println("Fligthing");
    }
}
