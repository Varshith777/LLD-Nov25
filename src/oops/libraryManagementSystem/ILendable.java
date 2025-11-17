package oops.libraryManagementSystem;

public interface ILendable {
    boolean lend(User user);
    void returnBook(User user);
}
