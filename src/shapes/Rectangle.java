package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
public Rectangle(double lenght, double width){
    super(lenght, width);
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
