package lesson15.library;

import lesson15.library.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
                 
public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Librarian annaPetrovna = new LibrarianImpl(1);

        //парсим xml файл и кладем в библиотеку книги
        try {
            ParserFormXml pfx = new ParserFormXml();
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            InputStream is = new FileInputStream("src/library/lesson15/books.xml");
            saxParser.parse(is, pfx);
           Library.setBooks(pfx.getAllBooks());
        } catch (Exception e){
            System.out.println(e);
        }

        Thread thread1 = new Thread(() -> {
            List<Book> booksOnHand = new ArrayList<>();
            List<Book> booksInRoom = new ArrayList<>();
            //Берет книги на дом
            try {
                annaPetrovna.lockLibrarian();
                booksOnHand.add(annaPetrovna.searchBooksOnHand("quo vadis", booksOnHand));
                booksOnHand.add(annaPetrovna.searchBooksOnHand("Meet without border", booksOnHand));
                booksOnHand.add(annaPetrovna.searchBooksOnHand("Son of God", booksOnHand));
                booksOnHand.add(annaPetrovna.searchBooksOnHand("The Brothers Karamazov", booksOnHand));

            } finally {
                annaPetrovna.unLockLibrarian();
            }
            //Идет домой и читает книги и возвращает книги
            try {
                Thread.sleep(10000);
                annaPetrovna.lockLibrarian();
                for (Book book: booksOnHand) {
                    annaPetrovna.retunBookOnShelf(book);
                }
                booksOnHand.clear();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                annaPetrovna.unLockLibrarian();
            }


        });
        thread1.setName("Andrei");


        Thread thread2 = new Thread(()->{
            List<Book> booksOnHand = new ArrayList<>();
            List<Book> booksInRoom = new ArrayList<>();
           //пытается взять книгу которую взял другой поток
            try {
               annaPetrovna.lockLibrarian();
               booksOnHand.add(annaPetrovna.searchBooksOnHand("quo vadis",booksOnHand));
               //решает взять книгу в читальный зал
               booksInRoom.add(annaPetrovna.searchBooksInRoom("history of art",booksInRoom));

           }catch (Exception e){
               e.printStackTrace();
           }finally {
               annaPetrovna.unLockLibrarian();
           }

           //читае книгу в зале и возвращает ее
           try {
               Thread.sleep(5000);
               annaPetrovna.lockLibrarian();
               for (Book book: booksInRoom) {
                   annaPetrovna.retunBookOnShelf(book);
               }
               booksInRoom.clear();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }finally {
               annaPetrovna.unLockLibrarian();
           }
        });
        thread2.setName("Petya");


        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        Library.printMyLibrary();


    }
}
