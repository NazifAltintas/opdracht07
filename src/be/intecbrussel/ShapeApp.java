package be.intecbrussel;


public class ShapeApp {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Square s1 = new Square();
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        IsoScelesTriangle i1 = new IsoScelesTriangle();

        s1.setPosition(-10, 0);
        s1.setSide(-15);
        System.out.println("square :" + Square.getCount());
        System.out.println("square height:" + s1.getHeight() + " square width:" + s1.getWidth());
        System.out.println("square position x:" + s1.getX() + " y:" + s1.getY());
        System.out.println("square angles:" + Square.ANGLES);
        System.out.println("square area:" + s1.getArea() + " square perimeter:" + s1.getPerimeter());

        c1.setPosition(7, 7);
        c1.setRadius(8);
        System.out.println("\ncircle :" + Circle.getCount());
        System.out.println("circle radius:" + c1.getRadius());
        System.out.println("circle position x:" + c1.getX() + " y:" + c1.getY());
        System.out.println("circle angles:" + Circle.ANGLES);
        System.out.println("circle area:" + c1.getArea() + " circle perimeter:" + c1.getPerimeter());

        r1.setPosition(3, 3);
        r1.setWidth(-9);
        r1.setHeight(6);
        System.out.println("\nrectangle :" + Rectangle.getCount());
        System.out.println("rectangle height:" + r1.getHeight() + " rectangle width:" + r1.getWidth());
        System.out.println("rectangle position x:" + r1.getX() + " y:" + r1.getY());
        System.out.println("square angles:" + Rectangle.ANGLES);
        System.out.println("rectangle area:" + r1.getArea() + " rectangle perimeter:" + r1.getPerimeter());

        i1.setPosition(3, 3);
        i1.setWidth(3);
        i1.setHeight(2);
        i1.setPerpendicular(7);
        System.out.println("\nisosceles triangle :" + IsoScelesTriangle.getCount());
        System.out.println("isosceles triangle height:" + i1.getHeight() + " isosceles triangle width:" + i1.getWidth()
                + " isosceles triangle perpendicular:" + t1.getPerpendicular());
        System.out.println("isosceles triangle position x:" + i1.getX() + " y:" + i1.getY());
        System.out.println("isosceles triangle angles:" + IsoScelesTriangle.ANGLES);
        System.out.println("isosceles triangle area:" + i1.getArea() + " isosceles triangle perimeter:" + i1.getPerimeter());

        t1.setPosition(3, 3);
        t1.setWidth(3);
        t1.setHeight(5);
        t1.setPerpendicular(4);
        System.out.println("\ntriangle :" + Triangle.getCount());
        System.out.println("triangle height:" + t1.getHeight() + " triangle width:" + t1.getWidth()
                + " triangle perpendicular:" + t1.getPerpendicular());
        System.out.println("triangle position x:" + t1.getX() + " y:" + t1.getY());
        System.out.println("triangle angles:" + Triangle.ANGLES);
        System.out.println("triangle area:" + t1.getArea() + " triangle perimeter:" + t1.getPerimeter());

        System.out.println("\nrectangle count:" + Rectangle.getCount());
        System.out.println("square count:" + Square.getCount());
        System.out.println("circle count:" + Circle.getCount());
        System.out.println("triangle count:" + Triangle.getCount());
        System.out.println("isosceles triangle count:" + IsoScelesTriangle.getCount());
        System.out.println("shape count:" + Shape.getCount());


    }
}
