package Ques_81_to_90;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// HTTP Server (Java 18+)

public class ques90 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server started on port 8080");
        
        while (true) {
            try (Socket client = server.accept();
                 var out = new PrintWriter(client.getOutputStream(), true)) {
                
                String response = """
                    HTTP/1.1 200 OK\r
                    Content-Type: text/plain\r
                    \r
                    Hello from Java HTTP Server!""";
                
                out.println(response);
            }
        }
    }
}
