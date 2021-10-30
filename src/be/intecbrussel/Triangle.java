package be.intecbrussel;

public class Triangle extends Shape{

    public final static int ANGLES = 3;
    private static int count;

    private int height;
    private int width;
    private int perpendicular;



    public Triangle() {
        this(1, 1,1);
    }

    public Triangle(int width, int height,int perpendicular) {
        this(width,height,perpendicular, 1, 1);
    }

    public Triangle(int width, int height,int perpendicular, int x, int y) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        setPerpendicular(perpendicular);
        count++;
    }

    public Triangle(Triangle t) {
        this(t.getWidth(),t.getHeight(),t.getPerpendicular(), t.getX(), t.getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            width = -width;
        } else {
            width = width;
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            height = -height;
        } else {
            height = height;
        }
        this.height=height;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {

        if (perpendicular < 0) {
            perpendicular = -perpendicular;
        } else {
            perpendicular = perpendicular;
        }
        this.perpendicular=perpendicular;

    }

    public double getArea() {
        double area = width * perpendicular / 2;
        return area;
    }

    public double getPerimeter() {
        double perimeter =  (width + height + perpendicular);
        return perimeter;
    }



    public static int getCount() {

        return count;
    }
}
