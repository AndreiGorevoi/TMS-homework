package lesson15.library;

public class Book {
    private int id;
    private String name;
    private String genre;
    private String author;
    private String dateOfPublish;
    private String typeOfCover;
    private String permission;

    public Book(int id, String name, String genre, String author, String dateOfPublish, String typeOfCover, String permission) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.dateOfPublish = dateOfPublish;
        this.typeOfCover = typeOfCover;
        this.permission = permission;
    }

    public String getDateOfPublish() {
        return dateOfPublish;
    }
    public void setDateOfPublish(String dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", dateOfPublish='" + dateOfPublish + '\'' +
                ", typeOfCover='" + typeOfCover + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateOfProduction() {
        return dateOfPublish;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfPublish = dateOfProduction;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }
}
