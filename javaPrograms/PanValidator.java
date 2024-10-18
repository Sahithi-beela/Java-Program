import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanValidator {

    
    public static boolean isValidPan(String pan) {
        
        String panPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        
        
        Pattern pattern = Pattern.compile(panPattern);
        Matcher matcher = pattern.matcher(pan);

        
        return matcher.matches();
    }

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter PAN number: ");
        String pan = scanner.nextLine();

        if (isValidPan(pan)) {
            System.out.println("The PAN number is valid.");
        } else {
            System.out.println("The PAN number is invalid.");
        }

        scanner.close();
    }
}