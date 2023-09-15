package Shape;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A shape that is color " + color;
    }

    public abstract double area();
    public abstract double perimeter();
}
