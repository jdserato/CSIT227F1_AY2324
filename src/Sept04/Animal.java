package Sept04;

import java.util.Comparator;

public abstract class Animal implements Comparable<Animal> {
    public String name;
    int age;

    @Override
    public int compareTo(Animal other) {
        return this.age < other.age ? -1 : age == other.age ? 0 : 1;
    }

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
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
        return name + "(" + age + ")";
    }

    public abstract void makeSound();

    public static class AnimalNameComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static class AnimalAgeComparator implements Comparator<Animal> {

        @Override
        public int compare(Animal o1, Animal o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }
}
