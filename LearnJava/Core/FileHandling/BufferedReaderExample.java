package LearnJava.Core.FileHandling;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        String PATH = "./LearnJava/Core/FileHandling/Example.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}