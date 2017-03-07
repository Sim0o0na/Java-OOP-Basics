package shapes;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Sim0o on 3/6/2017.
 */
public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.setHeight(height);
        this.setWidth(width);
    }
    private void setHeight(double height){
        this.height=height;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    protected void calculatePerimeter(){
        setPerimeter(this.height*2+this.width*2);
    }

    @Override
    protected void calculateArea(){
        setArea(this.height*this.width);
    }
}
