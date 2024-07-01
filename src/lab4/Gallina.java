package lab4;

import lab4.supertypeimp.Flight;
import lab4.supertypeimp.Grasnido;
import lab4.supertypeimp.Sing;

import java.util.logging.Logger;

public class Gallina extends Ave {

    public static final Logger logger = Logger.getLogger(Gallina.class.getName());

    public Gallina() {
        logger.info("instanciating Gallina");
        typeFlight = new Flight();
        typeSound = new Grasnido();
    }
}
