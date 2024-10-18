import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        uppercaseCount++;
                    } else if (Character.isLowerCase(c)) {
                        lowercaseCount++;
                    } else if (Character.isDigit(c)) {
                        digitCount++;
                    }
                }
            }
            System.out.println("Uppercase letters: " + uppercaseCount);
            System.out.println("Lowercase letters: " + lowercaseCount);
            System.out.println("Digits: " + digitCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}