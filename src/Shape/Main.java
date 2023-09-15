package Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        System.out.print("Enter shape: ");
        Scanner sc = new Scanner(System.in);
        String sh = sc.nextLine();
        switch (sh) {
            case "Rectangle":
                System.out.print("Enter length: ");
                double len = sc.nextDouble();
                System.out.print("Enter width: ");
                double wid = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                String color = sc.nextLine();
                shape = new Rectangle(len, wid, color);
                break;
            case "Square":
                color = sc.nextLine();
                break;
        }
        System.out.println(shape);
        System.out.println("The perimeter is " + shape.perimeter());
        System.out.println("The area is " + shape.area());
    }
}
