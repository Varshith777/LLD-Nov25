package advancedConcepts.exceptionHandling;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Calculator calculator = new Calculator();
        int result = calculator.divide(10,10,"Sandeep");
        System.out.println(result);
        pause();
        pause2(); // since its not handling the exception, either we handle here with try/catch or do throws
    }

    public static void pause(){
        try{
        Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pause2() throws InterruptedException {
        Thread.sleep(10000);
    }

    public static void findUserName(String userName){
        throw new UsernameNotFoundException("Username : " + userName + " not found");
    }

}
