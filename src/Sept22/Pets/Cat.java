package Sept22.Pets;

public class Cat extends Pet{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Walks");
    }
}
