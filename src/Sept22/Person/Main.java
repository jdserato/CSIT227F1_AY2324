package Sept22.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fname = sc.nextLine();
        System.out.print("Enter last name: ");
        String lname = sc.nextLine();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.println("\nObject 1");
        Person p1 = new Person(fname, lname);
        p1.display();
        System.out.println("\nObject 2");
        Person p2 = new Person(fname, lname, gender, address, age);
        p2.display();
    }
}
