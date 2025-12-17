package advancedConcepts.exceptionHandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {

    public int divide(int a, int b, String userName){
        ExecutorService executor = Executors.newFixedThreadPool(10);
        int result = 0;
        System.out.println("User Name: " + userName);
        try {
            System.out.println("Number of letters in username" + userName.length());
            result = a / b;
            executor.shutdown(); // this is done for clean up of resources
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Exception Found");
            System.out.println(e.getMessage());
        } finally {
            // if any exception happens from line 10 to 14, then line 15 for shutdown wont execute
            // hence, always keep resource clean up in finally block
            // because, finally block always executes
            System.out.println("FINALLY BLOCK");
            executor.shutdown();
        }
        return result;
    }
}
