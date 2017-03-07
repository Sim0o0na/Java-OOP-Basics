package shapes;

/**
 * Created by Sim0o on 3/6/2017.
 */
public class Circle extends Shape {
    private double radius;

    public final double getRadius(){
        return this.radius;
    }
    public Circle(double radius){
        this.setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter(){
        setPerimeter(2*Math.PI*this.radius);
    }

    @Override
    protected void calculateArea(){
        setArea(Math.PI*this.radius*this.radius);
    }
}
