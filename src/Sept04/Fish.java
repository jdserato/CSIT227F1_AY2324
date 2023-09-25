package Sept04;

public class Fish extends Animal implements Swimmer{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish " + name + ": Bloop bloop");
    }

    @Override
    public void swim() {
        System.out.println(name + " a fish -- is swimming " + distance);
    }

    @Override
    public int dive() {
        System.out.println(name + " a fish -- is diving very deeply");
        return 0;
    }

    public void drinkWater() {
        System.out.println("Fish " + name + ": I WANT JUICE");
    }
}
