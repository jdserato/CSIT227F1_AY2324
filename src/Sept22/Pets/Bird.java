package Sept22.Pets;

public class Bird extends Pet{
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void move() {
        System.out.println("Flies");
    }
}
