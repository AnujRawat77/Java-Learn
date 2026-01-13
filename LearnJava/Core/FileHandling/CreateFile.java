package LearnJava.Core.FileHandling;
import java.util.*;
import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("./LearnJava/Core/FileHandling/Example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
