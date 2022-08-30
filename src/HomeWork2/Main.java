package HomeWork2;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public static void main(String[] args) {
        System.out.println();
        System.out.println(ANSI_YELLOW + "Книга 1" + ANSI_RESET);

        //First Book

        Author2 author = new Author2("G.H.", "Wells");
        Book2 book = new Book2("The War of the Worlds", 1897, author);

        System.out.println(book.toString());
        System.out.println("Автор - " + author.toString());

        //Second Book

        System.out.println();
        System.out.println(ANSI_YELLOW + "Книга 2" + ANSI_RESET);

        Author2 authorBook2 = new Author2("Stiven", "King");
        Book2 book2 = new Book2("The Green Mile", 1996, author);

        System.out.println(book2.toString());
        System.out.println("Автор - " + authorBook2.toString());

        //Сomparison
        System.out.println();
        System.out.println(ANSI_RED + author.equals(authorBook2) + ANSI_RESET);
        System.out.println();
        System.out.println(author.hashCode() == authorBook2.hashCode());


        // Task 1.9 # 7
        System.out.println();
        System.out.println(ANSI_YELLOW + "Пункт 7 Задания 1.9" + ANSI_RESET);

        book2.setYearOfPublication(2000);
        System.out.println(ANSI_GREEN + "Год издания измененный- " + ANSI_RESET + ANSI_RED + book2.getyearOfPublication() + ANSI_RESET);

    }
}
