//package Sept04.Inner;
//
//import Sept04.*;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(13);
//        numbers.add(4);
//        numbers.add(1);
//        numbers.add(3);
//        Collections.sort(numbers);
//        for (Integer num : numbers) {
//            System.out.println(num);
//        }
//        Swimmer swimmer = new Fish("Nemo", 0);
//        System.out.println(((Animal)swimmer).name);
//        ArrayList<Animal> animals = new ArrayList<>();
//        Dog browny = new Dog("Browny", 4);
//        System.out.println(browny.getName());
//        Cat nyako = new Cat("Nyako", 3);
////        System.out.println(nyako);
//        Bat abat = new Bat("Abat", 5);
//        Tiger lion = new Tiger("Lion", 8);
//        Animal animal = new Cat("Blacky", 3);
//        Penguin pengwing = new Penguin("Pengwing", 5);
//        Whale wailord = new Whale("Wailord", 500);
//        Fish magikarp = new Fish("Magikarp", 2);
//        animals.add(browny);
//        animals.add(nyako);
//        animals.add(abat);
//        animals.add(lion);
//        animals.add(animal);
//        animals.add(pengwing);
//        animals.add(wailord);
//        animals.add(magikarp);
//        // uses COMPARABLE
////        Collections.sort(animals);
//        Collections.sort(animals);
//        // uses COMPARATOR
////        Collections.sort(animals, new Animal.AnimalAgeComparator());
//        animals.sort(new Animal.AnimalNameComparator());
//        for (Animal a : animals) {
//            System.out.println(a);
////            a.makeSound();
////            if (a instanceof Flyer) {
////                ((Flyer) a).fly();
////            }
////            if (a instanceof Swimmer) {
////                ((Swimmer) a).swim();
////                ((Swimmer) a).dive();
////                Swimmer.drinkWater();
////            }
////            if (a instanceof Diver) {
////                ((Diver) a).dive(1000);
////            }
//        }
//    }
//}
