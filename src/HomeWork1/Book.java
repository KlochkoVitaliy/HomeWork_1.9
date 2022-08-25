package HomeWork1;

public class Book {
    private String nameOfBook;
     private int yearOfPublication;
    private Author author;

    public Book(String nameOfBook, int yearOfPublication, Author author) {
        this.nameOfBook = nameOfBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }
    public int getyearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
       }

}
