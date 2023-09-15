package Sept04.Inner;

import Sept04.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Dog browny = new Dog("Browny", 4);
        Animal animal2 = new Cat("Animal");
        animal2.makeSound();
        System.out.println(browny.getName());
        Cat nyako = new Cat("Nyako");
        System.out.println(nyako);
        Tiger lion = new Tiger("Lion", 8);
        System.out.println(lion);
        Animal kokomi = new Tilapia("Kokomi", 20);
        kokomi.makeSound();
        Animal animal = new Cat("Blacky");
        animals.add(browny);
        animals.add(nyako);
        animals.add(lion);
        animals.add(animal);
        animals.add(kokomi);
        System.out.println("MAKING SOUNDS:");
        for (Animal a : animals) {
            a.makeSound();
            if (a instanceof Cat) {
                Cat miming = (Cat) a;
                miming.climbTrees();
            }
        }
    }
}
