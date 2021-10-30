package be.intecbrussel;

public class Shape {

    private static int count;

    private int x;
    private int y;

    public Shape() {
        this(5,5);
    }

    public Shape(int x, int y) {
        setPosition(x,y);
        count++;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x,int y) {
        setX(x);
        setY(y);
        }

    public double getArea() {
        double area=0;
        return area;
    } // area will change

    public double getPerimeter() {
        double perimeter=0;
        return perimeter;
    } // perimeter will change

    public static int getCount() {
        return count;
    }
}
