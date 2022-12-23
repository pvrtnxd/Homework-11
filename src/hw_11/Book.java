package hw_11;

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


}
