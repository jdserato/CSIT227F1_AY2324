package Sept04;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
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
