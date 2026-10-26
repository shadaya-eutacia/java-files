import java.io.*;

public class Exp14_FileProcessingDemo {
    public static void main(String[] args) {
        String filename = "sample.txt";

        // 1. Writing to a file using BufferedWriter and FileWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Hello, Java I/O Streams!");
            bw.newLine();
            bw.write("Demonstrating Buffered Readers and Writers.");
            System.out.println("Data successfully written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Reading from a file using BufferedReader and FileReader
        System.out.println("\n--- Reading from File ---");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}