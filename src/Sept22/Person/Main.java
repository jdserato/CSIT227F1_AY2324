package Sept22.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
            br.readLine();
        } catch (IOException e) {

        }

        String array[] = {"5", "6", "skrejfbsk"};
//        try {
            int num = Integer.parseInt(array[2]);
            System.out.println(num);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("No index 2");
//        } catch (NumberFormatException e) {
//            System.err.println("Not a number " + e.getMessage());
//        }



//        int answer = 5 / 0;

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first name: ");
        String fname = "jay";
//        System.out.print("Enter last name: ");
        String lname = "ser";
//        System.out.print("Enter gender: ");
        String gender = "m";
        int age = 0;
        String address = null;
        boolean okayna = false;
        do {
            try {
                System.out.print("Enter age: ");
                age = sc.nextInt();
                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be less than zero");
                }
                if (age > 150) {
                    throw new IllegalArgumentException("Age cannot be greater than 150");
                }
                okayna = true;
            } catch (IllegalArgumentException | ArithmeticException | NoSuchElementException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.err.println("DO NOT KNOW");
                sc.nextLine();
                e.printStackTrace();
            }
        } while (!okayna);

        sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.println("\nObject 1");
        Person p1 = new Person(fname, lname);
        p1.display();
        System.out.println("\nObject 2");
        Person p2 = new Person(fname, lname, gender, address, age);
        p2.display();
        List<Person> personList = new ArrayList<>();
        try {
//            p1.setAge(5);
            int ctr = 1;
            while (true){
//                ctr++;
//                System.out.println(ctr);
                personList.add(new Person(fname, lname, gender, address, age));
//                p2.display();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Error e) {
            System.out.println("HI you've got error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("CHECK RUN");
    }
}
