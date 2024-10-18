import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteMarks {
    public static void main(String[] args) {
        String filename = "Marks.data";
        Random random = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < 20; i++) {
                int mark = random.nextInt(101); 
                writer.write(String.valueOf(mark)); 
                if (i < 19) { 
                    writer.write(", ");
                }
            }
            System.out.println("20 marks have been written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}