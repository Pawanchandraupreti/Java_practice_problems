package Ques_71_to_80;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Decorator Pattern (I/O Example)

class UppercaseInputStream extends FilterInputStream {
    public UppercaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1) ? c : Character.toUpperCase(c);
    }
}


public class ques78 {
    public static void main(String[] args) throws IOException {
        String text = "hello decorator pattern!";
        try (InputStream in = 
                new UppercaseInputStream(
                    new ByteArrayInputStream(text.getBytes()))) {
            
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
        }
    }
}
