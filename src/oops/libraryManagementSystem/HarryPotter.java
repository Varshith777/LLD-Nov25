package oops.libraryManagementSystem;

public class HarryPotter extends Book implements ILendable{

    public HarryPotter(String isbn, String title, String author, boolean isAvailable) {
        super(isbn, title, author, isAvailable);
    }

    @Override
    public boolean lend(User user) {
        return false;
    }

    @Override
    public void returnBook(User user) {

    }
}
