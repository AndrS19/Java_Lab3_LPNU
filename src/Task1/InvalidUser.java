package Task1;

public class InvalidUser extends Exception {
    public InvalidUser(final String message, final Codes code) {
        super(code.getCode() + ": " + message);
    }
}