package examples.by.yurachel.blinov.patterns.creational_patterns.prototype.example;

public class Book extends Issue {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(Integer id, String author, String name, int year) {
        super(id, name, year);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }
}
