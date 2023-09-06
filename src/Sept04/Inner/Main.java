package Sept04.Inner;

import Sept04.Cat;
import Sept04.Tiger;

public class Main {
    public static void main(String[] args) {
        Dog browny = new Dog("Browny", 4);
        System.out.println(browny.getName());
        Cat nyako = new Cat("Nyako", 3);
        System.out.println(nyako);
        Tiger lion = new Tiger("Lion", 8);
        System.out.println(lion);
        browny.makeSound();
        nyako.makeSound();
        lion.makeSound();
    }
}
