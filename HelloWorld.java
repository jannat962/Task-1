import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
                       // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
                       // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        
                       // Read the user's input as a String
        String name = scanner.nextLine();
        
                        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to the HelloWorld.");
        
                        // Close the Scanner object
        scanner.close();
    }
}
