package lab5;

import lab5.supertypeimp.Grasnido;

import java.util.Objects;
import java.util.logging.Logger;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class.getName());
    public void CanarioTest() {
        Canario canario = new Canario();
        Objects.requireNonNull(canario);

        logger.info("CanarioTest Flight");
        System.out.println("CanarioTest Flight");
        logger.info("CanarioTest Sound");
        System.out.println("CanarioTest Sound");
        canario.makeSound();
        System.out.println("Canario change sound");
        canario.setTypeSound(new Grasnido());
        System.out.println("Canario Sound");
        canario.makeSound();
    }
}
