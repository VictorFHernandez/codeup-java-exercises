package shapes;


public abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        super(length,width);
    }

    public void Mesurements(double lenght, double width){
        this.length = lenght;
        this.width = width;
    }

    public double length(){
        return length;
    }

    abstract void setLength(double length);

    public double width(){
        return width;
    }

    abstract void setWidth(double width);
}
