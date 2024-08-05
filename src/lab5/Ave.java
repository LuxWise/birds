package lab5;

import lab5.superType.TypeFlight;
import lab5.superType.TypeSound;

public abstract class Ave {
    TypeSound typeSound;
    TypeFlight typeFlight;

    public void setTypeFlight (TypeFlight typeFlight) {
        this.typeFlight = typeFlight;
    }
    public void  setTypeSound (TypeSound typeSound) {
        this.typeSound = typeSound;
    }
    public void fly() {
        typeFlight.flight();
    }
    public void makeSound() {
        typeSound.makeSound();
    }

}
