package be.intecbrussel;

public class IsoScelesTriangle extends Triangle {

    private static int count;


    public IsoScelesTriangle() {
        this(1, 1);
    }

    public IsoScelesTriangle(int width, int height) {
        this(width, height, 1, 1);
    }

    public IsoScelesTriangle(int width, int height, int x, int y) {
        super(width, height, height, x, y);
        count++;

    }

    public IsoScelesTriangle(IsoScelesTriangle t) {
        super(t);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    @Override
    public void setPerpendicular(int perpendicular) {

        super.setHeight(perpendicular);
        super.setPerpendicular(perpendicular);


    }

    public static int getCount() {
        return count;
    }

}
