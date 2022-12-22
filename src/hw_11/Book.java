package hw_11;

public class Book {
    String authorName;
    String bookName;
    int publishingYear;

    public Book (String authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public  String getBookAuthorName() {
        return this.authorName;
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
