package Sep01;

import Another.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pips: " + Person.NUMBER_OF_PEOPLE);
        Person vince = new Person();
        System.out.println("Pips: " + Person.NUMBER_OF_PEOPLE);
        vince.name = "Jay Vince";
        System.out.print("Enter age: ");
        vince.age = sc.nextInt();
        System.out.println(vince.name);
        System.out.println("Age: " + vince.getAge());
        vince.eat();
        vince.eat("Ice Cream");
        vince.eat(5, "Coke");
        vince.eat("Ginaling", 120);

        Person cherry, cheryl, jasmin, chris;
        cherry = new Person("Cherry Lyn Sta. Romana");
        Person leah = new Person("Leah Barbaso", 19);
        System.out.println("Pips: " + vince.NUMBER_OF_PEOPLE);
        System.out.println("Name is " + cherry.name);
        System.out.println(cherry.getAge());
        System.out.println("Name is " + leah.name);
        System.out.println(leah.getAge());
        System.out.println("Cherry species: "+cherry.species);
        System.out.println("Vince species: "+vince.species);
    }
}
