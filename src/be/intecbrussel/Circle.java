package be.intecbrussel;

public class Circle extends Shape {

    public final static int ANGLES = 0;
    public final static double PI = 3.14;
    private static int count;

    private int radius;

    public Circle() {
        this(1);
    }

    public Circle(int radius) {
        this(radius, 1, 1);
    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        setRadius(radius);
        count++;
    }

    public Circle(Circle c) {
        this(c.getRadius(), c.getX(), c.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {

        if (radius < 0) {
            radius = -radius;
        } else {
            radius = radius;
        }
        this.radius = radius;
    }

    public double getArea() {
        double area = PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * PI * radius;
        return perimeter;
    }

    public void grow(int d) {
        setRadius(radius * d);
    }

    public static int getCount() {
        return count;
    }
}
