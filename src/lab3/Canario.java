package lab3;

import lab3.interfaces.Fly;

public class Canario extends Ave implements Fly {
    public void makeSound () {
        System.out.println("Sing");
    }
    public void fly() {
        System.out.println("Flying");
    }
}
