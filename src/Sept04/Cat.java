package Sept04;

public class Cat extends Animal{
    float age;
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Cat";
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + name + ": MEOWWWWW");
    }

    public void climbTrees() {
        System.out.println(name + " is climbing trees");
    }
}
