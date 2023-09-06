package Sep01;

public class Person {
    public static int NUMBER_OF_PEOPLE = 0;
    public static final String species = "Homo Sapiens";
    public static final double PI = 3.14159;
    // FIELDS
    protected String name;
    public int age;

    // CONSTRUCTOR
    public Person() {
        this("no name", 18);
    }

    public Person(String name) {
        this(name, 18);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        NUMBER_OF_PEOPLE++;
    }

    // METHOD OVERLOADING
    int getAge(){
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    void eat() {
        eat("some food");
    }
    void eat(String food) {
        System.out.println(name + " is beautifully eating " + food);
    }
    void eat(int quantity, String drink) {
        System.out.println(name + " is eating " + quantity + " times with " + drink);
    }
    void eat(String food, int calories) {
        System.out.println(name + " is eating " + food + " with " + calories + " calories");
    }

}
