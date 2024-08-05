package lab5;

import lab5.supertypeimp.Flight;
import lab5.supertypeimp.Sing;

import java.util.logging.Logger;

public class Canario extends Ave {

    public static final Logger logger = Logger.getLogger(Canario.class.getName());

    public Canario() {
        logger.info("instanciating Canario");
        this.setTypeSound(new Sing());
        this.setTypeFlight(new Flight());
    }

}
