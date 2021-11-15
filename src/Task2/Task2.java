package Task2;

public class Task2 {
    public static void main(final String[] arguments) {

        try (final MyResource resource = new MyResource()) {
            resource.action();
        } catch (final Exception e) {
            System.out.println("Regular exception: " + e);

            final Throwable[] suppressedExceptions = e.getSuppressed();
            final int n = suppressedExceptions.length;

            if (n > 0) {
                System.out.println("Found " + n + " suppressed exceptions:");
                for (final Throwable exception : suppressedExceptions) {
                    System.out.println(exception.toString());
                }
            }
        }
    }
}