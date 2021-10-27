package Q1;
//This class should extends book class and implement the interface.
//
//Fiction (String title, double price, String publishYear); //Constructor
//
//Also implement the abstract method in parent class.
//
//Sample description : “Frankenstein(title) all events are imaginary and not based on real facts”
public class Fiction extends Book implements iBorrowable{
    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return this.getTitle() + " all events are imaginary and not based on real facts";
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
