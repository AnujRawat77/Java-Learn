package LearnJava.Core.FileHandling;
import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String PATH = "./LearnJava/Core/FileHandling/Example.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
            bw.write("Hello, BufferedWriter!");
            bw.newLine(); // Adds a new line
            bw.write("This is the second line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
