package lesson15.library;


import lesson15.library.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> myLibrary = new ArrayList<>();

    public static List<Book> getBooks(){
        return myLibrary;
    }
    public static void setBooks(List<Book> books){
        myLibrary=books;
    }

    public static void printMyLibrary(){
        if(myLibrary.size()>0){
            myLibrary.forEach(System.out::println);
        }
    }
    /*  public static Book findBookForRoom(String nameOfBook, Reader reader){
        if(reader.howManyBooksInRoom()>0){
            System.out.println("Sorry, but you have a lot of books in room");
            return null;
        }
        for (Book book: myLibrary) {
            if(book.getName().equalsIgnoreCase(nameOfBook)){
                myLibrary.remove(book);
                System.out.println("Take your book: "+ book.getName());
                return book;
            }
        }
        System.out.println("We don't have that book");
        return null;
    }

    public static Book findBookForHand(String nameOfBook, Reader reader){
        if(reader.howManyBooksOnHand()>2){
            System.out.println("Sorry, but you have a lot of books on your hands");
            return null;
        }
        for (Book book: myLibrary) {
            if(book.getName().equalsIgnoreCase(nameOfBook)){
                if(book.getPermission().equalsIgnoreCase("only library")){
                    System.out.println("Sorry, but you can't take the book. It's only for reading in library room");
                    return null;
                }
                myLibrary.remove(book);
                System.out.println("Take your book: "+ book.getName());
                return book;
            }
        }
        System.out.println("We don't have that book");
        return null;
    }

    public static boolean returnBookOnShelf(Book book){
        boolean result = myLibrary.add(book);
        return result;
    }*/
}
