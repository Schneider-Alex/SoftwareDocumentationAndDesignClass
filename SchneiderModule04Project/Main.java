import java.util.*;

/**
 * Main class that demonstrates reading a list of integers from the console,
 * storing them in a LinkedList, and then sorting and printing the sorted list.
 */
public class Main {

    /**
     * Main method that handles the input, sorting, and output operations.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read inputs from the console
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store the integers entered by the user
        LinkedList<Integer> numbers = new LinkedList<>();

        // Prompt the user to start entering the integers
        System.out.println("Enter integers (type 'done' to finish):");

        // Start a while loop that will continue to execute as long as there are inputs to read
        while (scanner.hasNext()) {
            // Check if the next input is an integer
            if (scanner.hasNextInt()) {
                // If it is an integer, add it to the LinkedList
                numbers.add(scanner.nextInt());
            } else {
                // If it is not an integer, read the input as a string
                String next = scanner.next();

                // Check if the input is the word "done" (ignoring case)
                if ("done".equalsIgnoreCase(next)) {
                    // If it is "done", break out of the while loop
                    break;
                } else {
                    // If it is something else, inform the user of the invalid input and prompt again
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                }
            }
        }

        // Sort the integers in the LinkedList in ascending order
        Collections.sort(numbers);

        // Print out the sorted list of integers
        System.out.println("Sorted numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
