package Task2;

public class MyResource implements AutoCloseable {

    public void action() {
        throw new RuntimeException();
    }

    @Override
    public void close() {
        throw new ArithmeticException("Close");
    }
}