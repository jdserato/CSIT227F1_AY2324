package Sept04;

public class Penguin extends Bird implements Swimmer{
    public Penguin(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    public int dive() {
        System.out.println(name + " -- a penguin -- can dive shallow");
        return 0;
    }
}
