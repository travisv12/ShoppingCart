import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select language
        System.out.println("Select a language: ");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");
        int choice = scanner.nextInt();

        Locale locale;
        switch (choice) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("sv", "SE");
                break;
            case 4:
                locale = new Locale("ja", "JP");
                break;
            default:
                locale = new Locale("en", "US");
                break;
        }

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);

        // Prompt user for the number of items
        System.out.print(rb.getString("enterNumberOfItems") + ": ");
        int numberOfItems = scanner.nextInt();

        double totalCost = 0.0;

        for (int i = 0; i < numberOfItems; i++) {
            System.out.print(rb.getString("enterPrice") + " " + (i + 1) + ": ");
            double price = scanner.nextDouble();

            System.out.print(rb.getString("enterQuantity") + " " + (i + 1) + ": ");
            int quantity = scanner.nextInt();

            totalCost += price * quantity;
        }

        // Display the total cost
        System.out.printf(rb.getString("totalCost") + ": %.2f", totalCost);

        scanner.close();
    }
}