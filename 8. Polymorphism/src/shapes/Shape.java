package shapes;

/**
 * Created by Sim0o on 3/6/2017.
 */
public abstract class Shape {
    private double perimeter;
    private double area;

    protected void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    public double getPerimeter(){
        return this.perimeter;
    }
    protected void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return this.perimeter;
    }
    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();
}
