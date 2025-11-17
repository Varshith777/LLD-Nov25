package oops.libraryManagementSystem;

public class Librarian extends User{

    private String employeeNumber;

    public Librarian(int userId, String name, String contactInfo, String employeeNumber) {
        super(userId, name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayData() {
        System.out.println("Name: " + getName());
        System.out.println("Employee Number: " + getEmployeeNumber());
        System.out.println("Contact Number: " + getContactInfo());
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
