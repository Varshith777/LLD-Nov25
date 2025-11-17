package oops.libraryManagementSystem;

public class Member extends User{

    private int MAX_BORROW_LIMIT = 5;
    private int currentBorrowed = 0;

    public Member() {
    }

    public Member(int userId, String name, String contactInfo, int currentBorrowed) {
        super(userId, name, contactInfo); // used to pass the values to parent constructor
        this.currentBorrowed = currentBorrowed;
    }

    @Override
    public void displayData() {
        System.out.println("Name: " + getName());
        System.out.println("Current borrowed: " + currentBorrowed);
    }

    @Override
    public boolean canBorrowBooks() {
        return currentBorrowed < MAX_BORROW_LIMIT;
    }
}
