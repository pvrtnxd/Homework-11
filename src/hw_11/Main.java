package hw_11;

public class Main {
    public static void main (String[] args) {
        Author lnTolstoy = new Author("Лев ", "Николаевич ", "Толстой");
        Book warAndPeace = new Book(lnTolstoy,"Война и мир", 1867);
        Book warAndPeace1 = new Book(lnTolstoy,"Война и мир", 1867);

        Author blPasternak = new Author("Борис ", "Леонидович ", "Пастернак");
        Book doctorZhivago = new Book(blPasternak, "Доктор Живаго", 1945 );

        System.out.println(warAndPeace);
        System.out.println(doctorZhivago);

        doctorZhivago.setBookPublishingYear(1946);
        System.out.println( doctorZhivago);

        System.out.println(warAndPeace.equals(doctorZhivago));
        System.out.println(warAndPeace.equals(warAndPeace1));
        System.out.println(doctorZhivago.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(warAndPeace1.hashCode());





    }
}
