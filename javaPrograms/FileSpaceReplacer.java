import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileSpaceReplacer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        File inputFile = new File(filePath);

        
        String fileContent = "";
        try {
            fileContent = new String(Files.readAllBytes(inputFile.toPath()));
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        
        String modifiedContent = fileContent.replaceAll("\\s+", " ");

        
        System.out.print("Enter the file path to save the modified content: ");
        String outputFilePath = scanner.nextLine();
        File outputFile = new File(outputFilePath);

        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            fileWriter.write(modifiedContent);
            System.out.println("File has been modified successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        scanner.close();
    }
}