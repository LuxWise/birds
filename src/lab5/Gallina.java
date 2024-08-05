package lab5;

import lab5.supertypeimp.Flight;
import lab5.supertypeimp.Grasnido;

import java.util.logging.Logger;

public class Gallina extends Ave {

    public static final Logger logger = Logger.getLogger(Gallina.class.getName());

    public Gallina() {
        logger.info("instanciating Gallina");
        typeFlight = new Flight();
        this.setTypeSound(new Grasnido());
        this.setTypeFlight(new Flight());
    }
}
