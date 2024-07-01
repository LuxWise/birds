package lab3;

import lab3.interfaces.Fly;

public class Gallina extends Ave implements Fly {
    public void makeSound(){
        System.out.println("Graze");
    }
    public void fly(){
        System.out.println("doesn't fly");
    }
}
