package Sept04;

public abstract class Animal {
    public String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + ")" + super.toString();
    }

    public abstract void makeSound();
}
