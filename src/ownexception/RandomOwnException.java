package ownexception;

public class RandomOwnException extends Exception{

    public RandomOwnException() {
    }

    public RandomOwnException(String message) {
        super(message);
    }

    public RandomOwnException(String message, Throwable cause) {
        super(message, cause);
    }

    public RandomOwnException(Throwable cause) {
        super(cause);
    }

    public RandomOwnException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
