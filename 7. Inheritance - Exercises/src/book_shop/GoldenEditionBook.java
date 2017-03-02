package book_shop;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class GoldenEditionBook extends Book {
    public GoldenEditionBook(String name, String author, double price){
        super(name, author, price);
    }

    @Override
    public double getPrice(){
        return super.getPrice()+(0.3*super.getPrice());
    }
}
