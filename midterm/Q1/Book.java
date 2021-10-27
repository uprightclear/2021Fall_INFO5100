package Q1;
//This abstract class should have the following three private data members.
//
//Fields: String title, double price, String publishYear
//
//Book (String title, double price, String publishYear); //Constructor
//
//Following are the public methods that this class should provide:
//
//Methods: getter and setters
//
//Add an abstract method to this class called description that will return a string.
public abstract class Book {

    private String title;
    private double price;
    private String publishYear;

    public int borrowDate;
    public int returnDate;

    public Book(String title, double price, String publishYear) {
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public void following() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    abstract String description();

}
