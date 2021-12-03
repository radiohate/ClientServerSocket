import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Phone phone = new Phone("127.0.0.1", 8000)) {
            System.out.println("Connected  to server");
            String request = "Makuhari";
            System.out.println("Request: " + request);
            phone.writeLine(request);
            String responce = phone.readLine();
            System.out.println("Response:  " + responce);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
