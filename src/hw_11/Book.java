package hw_11;

import java.util.Objects;

public class Book {
    private Author authorName;
    private String bookName;
    private int publishingYear;

    public Book (Author authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public  Author getBookAuthorName() {
        return authorName;
    }

    public  String getBookName() {
        return this.bookName;
    }

    public  int getBookPublishingYear() {
        return this.publishingYear;
    }

    public void setBookPublishingYear (int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название произведения: " + bookName + "; Автор: " + authorName + "; Год: " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(authorName, book.authorName) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName);
    }
}
