package shapes;

public class Rectangle {
    private int length(int input){
        return input;
    }

    private int width(int input){
        return input;
    }

    public int getArea(){
        return length(5) * width(4);
    }

    public int getPerimeter(){
        return (2 * length(5) + (2 * width(4)));
    }

}
