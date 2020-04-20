package lesson15.library;

import java.util.List;

public class LibrarianImpl implements Librarian {
    private int tempOfWorking;
    public LibrarianImpl(int tempOfWorking) {
        this.tempOfWorking = tempOfWorking;
    }

    @Override
    public Book searchBooksOnHand(String nameOfBook, List<Book> listOfBooksOnaHand) {
        if(listOfBooksOnaHand.size()<3){

            try {
                Thread.sleep(3000*tempOfWorking);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<Book> serchList = Library.getBooks();
            for (Book book: serchList) {
                if(book.getName().equalsIgnoreCase(nameOfBook)){
                    if(book.getPermission().equalsIgnoreCase("only library")){
                        System.out.println("Sorry, but only for library");
                        return null;
                    }
                    serchList.remove(book);
                    System.out.println("Take your book: "+ book.getName());
                    return book;
                }
            }
            System.out.println("We don't have that book");
            return null;
        }
        System.out.println("So much books on hands");
        return null;
    }

    @Override
    public Book searchBooksInRoom(String nameOfBook,List<Book> listOfBooksInRoom) {
        if(listOfBooksInRoom.size()<3){
            try {
                Thread.sleep(3000*tempOfWorking);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<Book> serchList = Library.getBooks();
            for (Book book: serchList) {
                if(book.getName().equalsIgnoreCase(nameOfBook)){
                    serchList.remove(book);
                    System.out.println("Take your book: "+ book.getName());
                    return book;
                }
            }
            System.out.println("We don't have that book");
            return null;
        }
        System.out.println("So much book in room");
        return null;
    }

    @Override
    public boolean retunBookOnShelf(Book book) {
        List<Book> retunList = Library.getBooks();
        if(book!=null){
            try {
                retunList.add(book);
                Thread.sleep(1000);
                return true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public void lockLibrarian() {
        lock.lock();
    }

    @Override
    public void unLockLibrarian() {
        lock.unlock();
    }

}
