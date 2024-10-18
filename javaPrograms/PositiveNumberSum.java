import java.util.Scanner;

public class PositiveNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        while (true) {
            System.out.print("Enter a number (or 'O' to stop): ");
            String input = scanner.nextLine();

            
            if (input.equalsIgnoreCase("O")) {
                break;
            }

            try {
                
                double number = Double.parseDouble(input);

                
                if (number > 0) {
                    sum += number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'O' to stop.");
            }
        }

        
        System.out.println("Sum of positive numbers: " + sum);
    }
}