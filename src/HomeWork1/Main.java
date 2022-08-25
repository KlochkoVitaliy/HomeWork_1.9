package HomeWork1;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public static void main(String[] args) {
        System.out.println();
        System.out.println(ANSI_YELLOW + "Книга 1" + ANSI_RESET);

        //First Book

        Author author = new Author("G.H.", "Wells");
        Book book = new Book("The War of the Worlds", 1897, author);
        String authorFName = author.getFName();
        String authorSName = author.getSName();
        String nameOfBook = book.getNameOfBook();
        book.setYearOfPublication(1897);


        System.out.println(ANSI_GREEN + "Название книги - " + ANSI_RESET + nameOfBook);
        System.out.println(ANSI_GREEN + "Год издания - " + ANSI_RESET + ANSI_RED + book.getyearOfPublication() + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Автор - " + ANSI_RESET + authorFName + authorSName);

        System.out.println();
        System.out.println(ANSI_YELLOW + "Книга 2" + ANSI_RESET);

        //Second Book

        Author authorBook2 = new Author("Stiven", "King");
        Book book2 = new Book("The Green Mile", 1996, author);


        System.out.println(ANSI_GREEN + "Название книги - " + ANSI_RESET + book2.getNameOfBook());
        System.out.println(ANSI_GREEN + "Год издания - " + ANSI_RESET + ANSI_RED + book2.getyearOfPublication() + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Автор - " + ANSI_RESET + authorBook2.getFName() + authorBook2.getSName());

        System.out.println();
        System.out.println(ANSI_YELLOW + "Пункт 7 Задания 1.9" + ANSI_RESET);

        book2.setYearOfPublication(2000);
        System.out.println(ANSI_GREEN + "Год издания измененный- " + ANSI_RESET + ANSI_RED + book2.getyearOfPublication() + ANSI_RESET);
    }
}
