package lab4;

import lab4.superType.TypeFlight;
import lab4.superType.TypeSound;

public abstract class Ave {
    TypeSound typeSound;
    TypeFlight typeFlight;


    public void takesFlight(){
        typeFlight.flight();
    }
    public void makeSound(){
        typeSound.makeSound();
    }

}
