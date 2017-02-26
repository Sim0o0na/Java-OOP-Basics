package class_box;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Figure {
        private double lenght;
    private double width;
    private double height;

    public Figure(double len, double w, double h){
        this.setLenght(len);
        this.setWidth(w);
        this.setHeight(h);
    }

    public double surfaceArea(){
        double surface = (2*this.getLenght()*this.getWidth()) +
                (2*this.getLenght()*this.getHeight()) + (2*this.getWidth()*this.getHeight());
        return surface;
    }

    public double lateralArea(){
        double lateral = (2*this.getLenght()*this.getHeight()) + (2*this.getWidth()*this.getHeight());
        return lateral;
    }

    public double volume(){
        double volume = this.getLenght()*this.getWidth()*this.getHeight();
        return volume;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLenght(double lenght) {
        if(lenght<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative. ");
        }
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative. ");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if(height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative. ");
        }
        this.height = height;
    }
}
