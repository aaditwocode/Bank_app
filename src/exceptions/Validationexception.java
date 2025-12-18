package exceptions;
public class Validationexception extends RuntimeException {
    public static void ValidationException(String message) {
        super(message);
    }
}