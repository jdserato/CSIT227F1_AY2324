package Another;

public class Point // QUESTION 1
// QUESTION 2 - this line until last line
{
    // QUESTION 3
    double x;
    double y;

    // QUESTION 4
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        x = 50;
        y = 50;
    }

    // QUESTION 5 - this line until last line
    public Point getMidpoint(Point p) {
        Point mid = new Point();
        mid.x = Math.abs(this.x - p.x);
        mid.y = Math.abs(this.y - p.y);
        return mid;
    }
    // QUESTION 6
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // QUESTION 7
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}
