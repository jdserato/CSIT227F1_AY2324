package Sept22.Person;

public class Person {
    String firstName, lastName, gender, address;
    int age;
    boolean complete;

    public Person(String firstName, String lastName, String gender, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.age = age;
        complete = true;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        complete = false;
    }

    public void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.print("Gender: ");
        if (complete) {
            System.out.print(gender);
        }
        System.out.print("\nAge: ");
        if (complete) {
            System.out.print(age);
        }
        System.out.print("\nAddress: ");
        if (complete) {
            System.out.print(address);
        }
        System.out.println();
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than zero");
        }
        if (age > 150) {
            throw new IllegalArgumentException("Age cannot be greater than 150");
        }
        setAge(age);
        this.age = age;
    }
}
