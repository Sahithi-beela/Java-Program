import java.util.Scanner;

public class TotalMarks {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks separated by commas: ");
        String input = scanner.nextLine();

        
        String[] marksArray = input.split(",");

        
        int total = 0;

        
        for (String mark : marksArray) {
            try {
                total += Integer.parseInt(mark.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + mark + " is not a valid number.");
            }
        }

        System.out.println("Total marks: " + total);
        
        
        scanner.close();
    }
}
