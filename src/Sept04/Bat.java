package Sept04;

public class Bat extends Mammal implements Flyer{
    public Bat(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(name + " abat -- is flying hopefully not spreading covid");
    }

    @Override
    public void makeSound() {

    }
}
