package lesson15.library;

import lesson15.library.Book;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class ParserFormXml extends DefaultHandler {

    private boolean name=false;
    private String sName="";
    private boolean book=false;
    private int idOfBook;
    private boolean author=false;
    private String sAuthor="";
    private boolean genre=false;
    private String sGenre="";
    private boolean dateOfPubish=false;
    private String sDateOfPublish="";
    private boolean typeOfCover=false;
    private String sTypeOfCover="";
    private boolean permission=false;
    private String sPermission="";

    List<Book> booksList = new ArrayList<>();

    public void startElement(String uri, String localName, String qName, Attributes attributes){
        if(qName.equalsIgnoreCase("book")){
//            book=true;
            idOfBook=Integer.valueOf(attributes.getValue(0));
        }
        if(qName.equalsIgnoreCase("name")){
            name=true;
        }
        if(qName.equalsIgnoreCase("author")){
            author=true;
        }
        if(qName.equalsIgnoreCase("genre")){
            genre=true;
        }
        if(qName.equalsIgnoreCase("dateOfPublish")){
            dateOfPubish=true;

        }
        if(qName.equalsIgnoreCase("typeOfCover")){
            typeOfCover=true;
        }
        if(qName.equalsIgnoreCase("permission")){
            permission=true;
        }
    }
    public void endElement(String uri, String localName, String qName){
        if(name){
            name=false;
        }
        if(author){
            author=false;
        }
        if(genre){
            genre=false;
        }
        if(dateOfPubish){
            dateOfPubish=false;

        }
        if(typeOfCover){
            typeOfCover=false;
        }
        if(permission){
            permission=false;
        }
        if(qName.equalsIgnoreCase("book")){
//            book=false;
            addBook(sName,sAuthor,sGenre,sDateOfPublish,sTypeOfCover,sPermission,idOfBook);
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if(name){
            sName=new String(ch,start,length);
        }
        if(author){
            sAuthor=new String(ch,start,length);
        }
        if(genre){
            sGenre=new String(ch,start,length);
        }
        if(dateOfPubish){
            sDateOfPublish=new String(ch,start,length);
        }
        if(typeOfCover){
            sTypeOfCover=new String(ch,start,length);
        }
        if(permission){
            sPermission=new String(ch,start,length);
        }
        super.characters(ch,start,length);
    }

    //addBook to List
    public void addBook(String name, String author,String genre,String dateOfPublish, String typeOfCover,
                        String permission,int id){
        Book book = new Book(id,name,genre,author,dateOfPublish,typeOfCover,permission);
        booksList.add(book);
    }
    //возвращаем заполненный список книг
    public List<Book> getAllBooks(){
        return booksList;
    }

}
