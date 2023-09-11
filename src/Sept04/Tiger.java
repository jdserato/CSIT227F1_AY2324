package Sept04;

public class Tiger extends Cat{
    String name;
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Tiger " + super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger " + ((Animal)this).name + ": RAAWWWRRR");
    }

    public void eatPerson(String name) {
        System.out.println(name + "has been eaten");
    }
}
