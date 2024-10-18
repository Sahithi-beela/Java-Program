import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileSearcher {
    
    public static boolean containsString(File file, String searchString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + file.getName());
            e.printStackTrace();
        }

        return false; 
    }

   
    public static void searchInDirectory(File directory, String searchString) {
        
        File[] files = directory.listFiles();

        if (files == null) {
            System.out.println("The specified path is invalid or not a directory.");
            return;
        }

        boolean found = false;

       
        for (File file : files) {
            if (file.isFile()) {
                
                if (containsString(file, searchString)) {
                    System.out.println("String found in file: " + file.getAbsolutePath());
                    found = true;
                }
            } else if (file.isDirectory()) {
                
                searchInDirectory(file, searchString);
            }
        }

        if (!found) {
            System.out.println("No file contains the specified string.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

       
        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();

       
        File directory = new File(directoryPath);

      
        if (directory.exists() && directory.isDirectory()) {
            searchInDirectory(directory, searchString);
        } else {
            System.out.println("The specified path is not a valid directory.");
        }

        scanner.close();
    }
}