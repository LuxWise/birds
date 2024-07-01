package lab4;

import lab4.supertypeimp.Flight;
import lab4.supertypeimp.Sing;

import java.util.logging.Logger;

public class Canario extends Ave {

    public static final Logger logger = Logger.getLogger(Canario.class.getName());

    public Canario() {
        logger.info("instanciating Canario");
        typeFlight = new Flight();
        typeSound = new Sing();
    }

}
