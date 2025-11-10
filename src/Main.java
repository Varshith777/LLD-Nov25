public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BankAccount tejaSavings = new BankAccount();
        tejaSavings.printDetails();

        tejaSavings.accountNumber = "12345";
        tejaSavings.accountHolderName = "Teja";
        tejaSavings.accountBalance = 1232321231;

        boolean result = tejaSavings.isBelowMinBalance();
        System.out.println("Is Below Minimum : " + result);

        BankAccount vikasSavings = new BankAccount();
        vikasSavings.accountNumber = "12346";
        vikasSavings.accountHolderName = "Vikas";
        vikasSavings.accountBalance = 112411231;

        System.out.println("Is Below Minimum : " + vikasSavings.isBelowMinBalance());

        BankAccount raviSavings = new BankAccount("A1234", 123123123, "Ravi");
        raviSavings.printDetails();

        BankAccount raviSavings2 = new BankAccount(raviSavings);
        raviSavings2.printDetails();
    }
}