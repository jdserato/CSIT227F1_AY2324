package Sept04;

public class Tilapia extends Fish{
    public Tilapia(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Tilapia " + name + ": i am a tilapia dont eat me pls");
    }
}
