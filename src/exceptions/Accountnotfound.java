package exceptions;

public class Accountnotfound extends RuntimeException {
    public Accountnotfound(String message) {
        super(message);
    }
}