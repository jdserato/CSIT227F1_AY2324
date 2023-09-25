package Sept04;

public interface Swimmer {
    int distance = 100;
    public abstract void swim();
    default int getDistance() {
        return distance;
    }

    int dive();

    static void drinkWater() {
        System.out.println("YUMMY WATER");
    }
}
