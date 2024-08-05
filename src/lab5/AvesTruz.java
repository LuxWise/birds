package lab5;

import lab5.supertypeimp.DontFlight;
import lab5.supertypeimp.DontSing;

import java.util.logging.Logger;

public class AvesTruz extends  Ave {

    public static final Logger logger = Logger.getLogger(AvesTruz.class.getName());

    public AvesTruz() {
        logger.info("instanciating avestruz");
        this.setTypeSound(new DontSing());
        this.setTypeFlight(new DontFlight());
    }
}
