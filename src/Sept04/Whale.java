package Sept04;

public class Whale extends Mammal implements Swimmer, Diver {
    public Whale(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    public int dive() {
        System.out.println(name+ "a whale -- is diving 100 meters");
        return 0;
    }

    @Override
    public void makeSound() {
        System.out.println("Whale " + name + ": WoooOOOOOoooooOOOO");
    }

    @Override
    public void dive(int meters) {
        System.out.println(name + " is diving " + meters + " deep");
    }
}
