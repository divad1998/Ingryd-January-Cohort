package Week1;

public class Book {
    private String title;
    private String author;
    private String publicationYear;
    private boolean borrowed;
    public int numberOfPages;

    private Book(){}

    public Book(String title, String author, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Title= " + title +
                ", Author= " + author +
                ", Publication Year= " + publicationYear +
                ", Borrowed= " + borrowed;
    }

    public static void main(String[] args) {
        System.out.println(new Book("lateral thinking", "leonardo", "2024-01-01"));
    }
}
