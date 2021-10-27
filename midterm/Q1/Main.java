package Q1;

public class Main {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("hahah", 3, "1997");
        System.out.println(fiction.description());
        fiction.setBorrowDate(1997);
        fiction.setReturnDate(1998);
        if(fiction.isAvailable(1999)) System.out.println("it's available");

    }
}
