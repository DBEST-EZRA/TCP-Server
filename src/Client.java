import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter circle radius: ");
            double radius = scanner.nextDouble();
            out.println(radius);
            String response = in.readLine();
            System.out.println(response);

        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
