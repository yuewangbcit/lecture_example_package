package src.midterm.review;

import java.util.Arrays;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String publisher;
    private int year;
    private int[] ISBN;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int[] getISBN() {
        return ISBN;
    }

    public void setISBN(int[] ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumOfChapters() {
        return numOfChapters;
    }

    public void setNumOfChapters(int numOfChapters) {
        this.numOfChapters = numOfChapters;
    }

    private int numOfChapters;

    public boolean identical(Book o) {
        return Arrays.equals(ISBN, o.ISBN);
    }

    public boolean equivalent(Book o) {
        return title.equals(o.title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publisher, year);
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.getTitle());
    }

}
