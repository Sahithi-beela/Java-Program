import java.util.Scanner;

public class WageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the day of the week (1 for Monday, 7 for Sunday): ");
        int day = scanner.nextInt();

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = scanner.nextInt();

        
        int wagePerHour;
        switch (day) {
            case 1, 2, 3 -> wagePerHour = 200; 
            case 4, 5 -> wagePerHour = 400;    
            case 6 -> wagePerHour = 600;        
            case 7 -> wagePerHour = 800;        
            default -> {
                System.out.println("Invalid day entered. Please enter a number between 1 and 7.");
                return; 
            }
        }

        
        double totalWage = wagePerHour * hoursWorked;

       
        if (totalWage > 2000) {
            totalWage += totalWage * 0.10; 
        }

        
        
        System.out.printf("Total wage for the week: Rs%.2f%n", totalWage);
    }
}
