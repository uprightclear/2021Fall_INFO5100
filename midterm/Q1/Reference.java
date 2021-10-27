package Q1;
//This class should extends book class.
//
//Fields: String category (example: dictionaries, encyclopedia)
//
//Fiction (String title, double price, String publishYear, String category); //Constructor
//
//Method: getter and setter
//
//Also implement the abstract method in parent class.
//
//Sample description : “World Maps(title) all information is real.”
public class Reference extends Book implements iBorrowable{
    private String category;

    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category = category;
    }

    @Override
    String description() {
        return this.getTitle() + " all information is real.";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(borrowDate <= day && day <= returnDate) return false;
        return true;
    }
}
