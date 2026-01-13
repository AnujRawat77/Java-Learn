package LearnJava.Core.FileHandling;
import java.util.*;
import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String PATH = "./LearnJava/Core/FileHandling/Example.txt";
        try (FileWriter writer = new FileWriter(PATH)) {
            writer.write("Hello, Java File Handling!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
