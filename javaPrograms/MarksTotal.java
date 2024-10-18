import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MarksTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename (e.g., Marks.txt): ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] marks = line.split(","); 
                int totalMarks = 0;

                for (String mark : marks) {
                    try {
                        totalMarks += Integer.parseInt(mark.trim()); 
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid mark found on line " + lineNumber + ": " + mark.trim());
                    }
                }

                System.out.println("Total marks for line " + lineNumber + ": " + totalMarks);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}