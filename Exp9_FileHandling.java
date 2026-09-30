import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exp9_FileHandling {

    public static void main(String[] args) {
        String fileName = "sample_output.txt";
        String contentToWrite = "Hello! This is a file handling experiment in Java.\nWriting and reading data successfully.";

        System.out.println("=== Step 1: Writing to File ===");
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(contentToWrite);
            System.out.println("Data successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }

        System.out.println("\n=== Step 2: Reading from File ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }

        
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}