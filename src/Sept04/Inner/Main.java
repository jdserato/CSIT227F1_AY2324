package Sept04.Inner;

import Sept04.Animal;
import Sept04.Cat;
import Sept04.Tiger;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Dog browny = new Dog("Browny", 4);
        System.out.println(browny.getName());
        Cat nyako = new Cat("Nyako", 3);
        System.out.println(nyako);
        Tiger lion = new Tiger("Lion", 8);
        Animal animal = new Cat("Blacky", 3);
        animals.add(browny);
        animals.add(nyako);
        animals.add(lion);
        animals.add(animal);
        for (Animal a : animals) {
            a.makeSound();
            if (a instanceof Cat) {
                ((Cat) a).climbTrees();
            }
        }
    }
}
