import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeWriter {

    
    public static boolean isValidCode(String input) {
        
        String regex = "^[a-zA-Z]+\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> validCodes = new ArrayList<>();

        
        while (true) {
            System.out.print("Enter a string (type 'end' to stop): ");
            String input = scanner.nextLine();

            
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            
            if (isValidCode(input)) {
                validCodes.add(input); 
            } else {
                System.out.println("Invalid input! Must be alphabets followed by digits.");
            }
        }

        
        Collections.sort(validCodes);

        
        try (FileWriter writer = new FileWriter("Codes.txt")) {
            for (String code : validCodes) {
                writer.write(code + System.lineSeparator());
            }
            System.out.println("Valid codes have been written to Codes.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        scanner.close();
    }
}

