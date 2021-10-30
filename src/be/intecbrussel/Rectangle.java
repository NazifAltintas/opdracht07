package be.intecbrussel;

public class Rectangle extends Shape {

    private static int count;
    public final static int ANGLES = 4;

    private int width;
    private int height;



    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int width, int height) {
        this(width, height, 1, 1);
    }

    public Rectangle(int width, int height, int x, int y) {
        super(x, y);
        setWidth(width);
        setHeight(height);
        count++;


    }

    public Rectangle(Rectangle r) {
        this(r.getHeight(), r.getWidth(), r.getX(), r.getY());
    }



    public void setWidth(int width) {
        if(width<0){
            width=-width;
        }else{
            width=width;
        }
        this.width=width;
    }
    public int getWidth() {
        return width;
    }



    public void setHeight(int height) {
        if(height<0){
            height=-height;
        }else{
            height=height;
        }
        this.height=height;


    }
    public int getHeight() {
        return height;
    }
    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }
    @Override
    public double getPerimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    public void grow(int d) {
        setWidth(width * d);
        setHeight(height * d);
    }

    public static int getCount() {
        return count;
    }
}
