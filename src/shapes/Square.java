package shapes;

public class Square extends Quadrilateral{


    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }


}
