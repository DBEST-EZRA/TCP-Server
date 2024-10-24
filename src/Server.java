import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("TCP Server Running...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    System.out.println("Client connected.");
                    String radiusString = in.readLine();
                    double radius = Double.parseDouble(radiusString);
                    double area = Math.PI * radius * radius;
                    out.println("The area of the circle is " + area);
                    System.out.println("Radius " + radius + ", Area " + area);
                } catch (IOException e) {
                    System.out.println("Connection error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("TCP Server error: " + e.getMessage());
        }
    }
}
