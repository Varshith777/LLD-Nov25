package advancedConcepts.exceptionHandling;

public class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException() {
    }

    public UsernameNotFoundException(String message) {
        super(message);
    }
}
