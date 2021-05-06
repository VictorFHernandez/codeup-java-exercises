package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Square(2, 3);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape = new Rectangle(2, 2);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
