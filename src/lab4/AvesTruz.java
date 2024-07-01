package lab4;

import lab4.supertypeimp.DontFlight;
import lab4.supertypeimp.DontSing;
import lab4.supertypeimp.Flight;

import java.util.logging.Logger;

public class AvesTruz extends  Ave {

    public static final Logger logger = Logger.getLogger(AvesTruz.class.getName());

    public AvesTruz() {
        logger.info("instanciating avestruz");
        typeFlight = new DontFlight();
        typeSound = new DontSing();
    }
}
