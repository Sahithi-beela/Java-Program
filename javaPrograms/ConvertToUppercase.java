import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input filename: ");
        String inputFile = scanner.nextLine();
        System.out.print("Enter the output filename: ");
        String outputFile = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("Contents converted to uppercase and written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}