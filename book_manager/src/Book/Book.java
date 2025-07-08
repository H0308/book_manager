package Book;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 19:15
 *
 * @Author: 憨八嘎
 */
public class Book {
    private String name;
    private String author;
    private double price;
    private boolean isBorrowed;

    public Book(String name, String author, double price, boolean isBorrowed) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.isBorrowed = isBorrowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && isBorrowed == book.isBorrowed && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, price, isBorrowed);
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + ", price=" + price + ", 是否借出：" + (!isBorrowed ? "未借出" : "已借出") + '}';
    }
}
