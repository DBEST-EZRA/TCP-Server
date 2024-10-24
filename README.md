# TCP Circle Area Calculator

This is a simple TCP-based client-server application in Java. The client sends the radius of a circle to the server, and the server calculates the area of the circle and sends the result back to the client.

## Features

- The server accepts a connection from the client.
- The client prompts the user to enter the radius of a circle.
- The server calculates the area of the circle using the formula `π * radius^2`.
- The server sends the calculated area back to the client.
- Both server and client use TCP sockets for communication.

## Prerequisites

- Java 8 or higher
- A terminal or command prompt

## How to Run

### 1. Compile the code

Make sure you have both `Server.java` and `Client.java` files in the same directory. Open a terminal/command prompt and run the following commands to compile both the server and client code:

```bash
javac Server.java Client.java
