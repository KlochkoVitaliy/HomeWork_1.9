package HomeWork2;

import java.util.Objects;

public class Book2 {
    private String nameOfBook;
    private int yearOfPublication;
    private Author2 author;

    public Book2(String nameOfBook, int yearOfPublication, Author2 author) {
        this.nameOfBook = nameOfBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

//    public String getNameOfBook() {
//        return nameOfBook;
//    }
//
    public int getyearOfPublication() {
        return yearOfPublication;
    }

   public void setYearOfPublication(int yearOfPublication) {
      this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Название книги - " + nameOfBook + "    Год издания - " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book2 book2 = (Book2) o;
        return yearOfPublication == book2.yearOfPublication && nameOfBook.equals(book2.nameOfBook) && author.equals(book2.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, yearOfPublication, author);
    }
}

