package lesson15.library;

import lesson15.library.Book;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public interface Librarian {
     Lock lock= new ReentrantLock();
    //выдача книг на руки
    Book searchBooksOnHand(String nameOfBook, List<Book> listOfBookOnHand);
    //выдача книг в читальный зал
    Book searchBooksInRoom(String nameOfBook,List<Book> listOfBookOnHand);
    //вернуть книгу в библиотеку
    boolean retunBookOnShelf(Book book);

    void lockLibrarian();
    void unLockLibrarian();

}
