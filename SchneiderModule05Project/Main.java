import java.util.*;

/**
 * Main class that demonstrates reading a list of integers from the console,
 * storing them in a Stack, and then printing the sorted stack.
 */
public class Main {

    /**
     * Inserts an integer into the stack such that the stack remains sorted.
     *
     * @param stack The stack to insert into
     * @param value The integer value to insert
     */
    public static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, value);

        stack.push(temp);
    }

    /**
     * Main method that handles the input and output operations.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read inputs from the console
        Scanner scanner = new Scanner(System.in);

        // Create a Stack to store the integers entered by the user
        Stack<Integer> numbers = new Stack<>();

        // Prompt the user to start entering the integers
        System.out.println("Enter integers (type 'done' to finish):");

        // Start a while loop that will continue to execute as long as there are inputs to read
        while (scanner.hasNext()) {
            // Check if the next input is an integer
            if (scanner.hasNextInt()) {
                // Insert the integer into the stack such that the stack remains sorted
                insertSorted(numbers, scanner.nextInt());
            } else {
                String next = scanner.next();

                if ("done".equalsIgnoreCase(next)) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                }
            }
        }

        // Print out the sorted stack of integers
        System.out.println("Sorted numbers in the stack:");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
