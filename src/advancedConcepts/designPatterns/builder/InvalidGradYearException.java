package advancedConcepts.designPatterns.builder;

public class InvalidGradYearException extends RuntimeException {

    public InvalidGradYearException() {
    }

    public InvalidGradYearException(String message) {
        super(message);
    }
}
