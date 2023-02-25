package midterm.review;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOfBooks {
    private ArrayList<Book> books;

    public CollectionOfBooks() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> removeBooks(String title) {
        List<Book> removed = new ArrayList<>();
        for(Book book : books) {
            if(title.equals(book.getTitle())) {
                removed.add(book);
            }
        }
        books.removeAll(removed);
        return removed;
    }

    public List<Book> searchForBooks(String surname) {
        List<Book> searchResult = new ArrayList<>();
        for(Book book : books) {
            if(book instanceof Novel || book instanceof GraphicNovel) {
                Novel novel = (Novel) book;
                if(novel.getAuthor().getSurname().equals(surname)) {
                    searchResult.add(book);
                }
            }
            if(book instanceof Textbook) {
                Textbook textbook = (Textbook) book;
                ArrayList<Author> authors = textbook.getAuthors();
                for(Author author : authors) {
                    if(author.getSurname().equals(surname)) {
                        searchResult.add(book);
                        break;
                    }
                }
            }
        }
        Collections.sort(searchResult);
        return searchResult;
    }
}
