package shopping_spree;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Person {
    private String name;
    private double money;
    private List<Product> bag;


    public Person(String n, double m) {
        this.setName(n);
        this.setMoney(m);
        this.bag = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name == null || name.trim().length() == 0){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getBag() {
        return bag;
    }

    public void buy(Product product) {
        if(this.getMoney()<product.getPrice()){
            String exceptionMessage = String.format("%s can't afford %s", this.getName(), product.getName());
            throw new IllegalArgumentException(exceptionMessage);
        }

        this.getBag().add(product);
        this.setMoney(this.getMoney()-product.getPrice());
    }

    public void printBag(){
        List<String> names =
                this.getBag().stream()
                        .map(Product::getName)
                        .collect(Collectors.toList());
        StringBuilder res = new StringBuilder();
        for (String s : names) {
            res.append(s).append(", ");
        }
        System.out.println(res.deleteCharAt(res.length()-2).toString());
    }
}
