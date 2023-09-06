package Another;

import Sep01.Person;

public class Student extends Person {
    void study() {
        System.out.println(name + " is studying");
    }

    protected void work() {
        study();
    }
}
