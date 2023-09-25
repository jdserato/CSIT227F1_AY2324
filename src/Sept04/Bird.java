package Sept04;

public class Bird extends Animal implements Flyer{
    protected Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(name + " a birdy -- is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird " + name + ": X x");
    }
}
