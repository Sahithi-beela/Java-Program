import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter starting date (DD-MM-YYYY):");
        String startDateString = scanner.nextLine();
        
        System.out.println("Enter ending date (DD-MM-YYYY):");
        String endDateString = scanner.nextLine();

        try {
            
            Date startDate = dateFormat.parse(startDateString);
            Date endDate = dateFormat.parse(endDateString);

            
            long differenceInMillies = endDate.getTime() - startDate.getTime();
            
           
            long differenceInDays = differenceInMillies / (1000 * 60 * 60 * 24);

            
            System.out.println("Number of days between " + startDateString + " and " + endDateString + ": " + differenceInDays);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD-MM-YYYY.");
        }

        scanner.close(); 
    }
}
