package Sept04.Inner;

import Sept04.Animal;
import Sept04.Mammal;
import Sept04.Swimmer;

public class Dog extends Mammal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + ": Arf arf");
    }
}
