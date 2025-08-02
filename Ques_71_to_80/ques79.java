package Ques_71_to_80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// Simple Socket Chat (Client)

public class ques79 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true);
        BufferedReader console = new BufferedReader(
            new InputStreamReader(System.in));

        String userInput;
        while ((userInput = console.readLine()) != null) {
            out.println(userInput);
            System.out.println("Server: " + in.readLine());
        }
    }
}
