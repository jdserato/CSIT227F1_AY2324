package Shape;

public class Rectangle extends Shape{
    double length, width;

    public Rectangle(double length, double width, String color) {
        super(color);
        if (length <= 0 || width <= 0) {
            System.out.println("OY NOT OK");
//            throw new Exception("OY NOT OK");
        }
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
