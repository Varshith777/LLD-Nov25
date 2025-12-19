package advancedConcepts.designPatterns.builder;

public class InvalidPhoneNumberException extends RuntimeException {

    public InvalidPhoneNumberException() {
    }

    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
