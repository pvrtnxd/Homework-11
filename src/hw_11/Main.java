package hw_11;

public class Main {
    public static void main (String[] args) {
        Book warAndPeace = new Book("Л.Н. Толстой","Война и мир", 1867);
        System.out.println( "Автор: " + warAndPeace.getBookAuthorName() + "; Произведение: " + warAndPeace.getBookName() + "; Год публикации: " + warAndPeace.getBookPublishingYear());
        Author LNTolstoy = new Author("Лев ", "Николаевич");
        System.out.println("Автор: " + LNTolstoy.getAuthorFirstName() + LNTolstoy.getAuthorLastName() + warAndPeace.getBookAuthorName());

        Book doctorZhivago = new Book("Пастернак", "Доктор Живаго", 1945 );
        System.out.println( "Автор: " + doctorZhivago.getBookAuthorName() + "; Произведение: " + doctorZhivago.getBookName() + "; Год публикации: " + doctorZhivago.getBookPublishingYear());
        Author BLPasternak = new Author("Борис ", "Леонидович");
        System.out.println("Автор: " + BLPasternak.getAuthorFirstName() + BLPasternak.getAuthorLastName() + " " + doctorZhivago.getBookAuthorName());

        doctorZhivago.setBookPublishingYear(1946);
        System.out.println( "Автор: " + doctorZhivago.getBookAuthorName() + "; Произведение: " + doctorZhivago.getBookName() + "; Год публикации: " + doctorZhivago.getBookPublishingYear());




    }
}
