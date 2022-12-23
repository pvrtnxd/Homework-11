package hw_11;

public class Main {
    public static void main (String[] args) {
        Author lnTolstoy = new Author("Лев ", "Николаевич ", "Толстой");
        Book warAndPeace = new Book(lnTolstoy,"Война и мир", 1867);
        System.out.println( "Автор: " + lnTolstoy.getAuthorFirstName() + lnTolstoy.getAuthorLastName() + lnTolstoy.getAuthorMiddleName() + "; Произведение: " + warAndPeace.getBookName() + "; Год публикации: " + warAndPeace.getBookPublishingYear());
        System.out.println("Автор: " + lnTolstoy.getAuthorFirstName() + lnTolstoy.getAuthorLastName() + lnTolstoy.getAuthorMiddleName());

        Author blPasternak = new Author("Борис ", "Леонидович ", "Пастернак");
        Book doctorZhivago = new Book(blPasternak, "Доктор Живаго", 1945 );
        System.out.println( "Автор: " + blPasternak.getAuthorFirstName() + blPasternak.getAuthorLastName() + " " + blPasternak.getAuthorMiddleName() + "; Произведение: " + doctorZhivago.getBookName() + "; Год публикации: " + doctorZhivago.getBookPublishingYear());
        System.out.println("Автор: " + blPasternak.getAuthorFirstName() + blPasternak.getAuthorLastName() + blPasternak.getAuthorMiddleName());

        doctorZhivago.setBookPublishingYear(1946);
        System.out.println( "Автор: " + blPasternak.getAuthorFirstName() + blPasternak.getAuthorLastName() + " " + blPasternak.getAuthorMiddleName() + "; Произведение: " + doctorZhivago.getBookName() + "; Год публикации: " + doctorZhivago.getBookPublishingYear());





    }
}
