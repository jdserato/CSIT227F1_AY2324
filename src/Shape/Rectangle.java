package Shape;

public class Rectangle extends Shape{
    double length, width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Rectangle";
    }

//        public static class Square extends Rectangle {
//
//        public Square(double side, String color) {
//            // TODO call super()
//        }
//    }
}
