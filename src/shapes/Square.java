package shapes;

public class Square extends Quadrilateral {
    public Square(double length, double width){
        super(length, width);
    }
    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

}

