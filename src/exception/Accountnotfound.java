package exception;

public class Accountnotfound extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}