package Sept04;

public class Cat extends Animal{
    String name;
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Cat";
    }
}
