package Task2;

import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(final String[] args) {
        try (final FileReader fileReader = new FileReader("D:\\test.txt");) {
            int chr = fileReader.read();
            while (chr != -1) {
                System.out.print((char) chr);
                chr = fileReader.read();
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}