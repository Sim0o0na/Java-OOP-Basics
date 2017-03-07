package book_shop;

import java.util.IllegalFormatException;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String author, String title, double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        if (title.length() < 3 || title.isEmpty()) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        String secondName = author.split("\\s+")[1];
        System.out.println();
        if (Character.isDigit(secondName.charAt(0)) || author.isEmpty()) {
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        if (price<1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();

    }
}
