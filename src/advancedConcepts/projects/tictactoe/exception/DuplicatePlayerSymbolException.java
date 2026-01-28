package advancedConcepts.projects.tictactoe.exception;

public class DuplicatePlayerSymbolException extends RuntimeException {
    public DuplicatePlayerSymbolException() {
    }

    public DuplicatePlayerSymbolException(String message) {
        super(message);
    }

    public DuplicatePlayerSymbolException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicatePlayerSymbolException(Throwable cause) {
        super(cause);
    }

    public DuplicatePlayerSymbolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
