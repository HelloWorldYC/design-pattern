package myc.decorator_pattern;

import myc.decorator_pattern.decorator.impl.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            ClassLoader classLoader = InputTest.class.getClassLoader();
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(classLoader.getResourceAsStream("test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
