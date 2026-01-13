package LearnJava.Core.FileHandling;

import java.util.*;
import java.io.*;

public class ReadFileException {
    public static void readFile(String fileName) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String line;
            System.out.println("File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        catch (IOException e) {
            System.out.println("Error: I/O error occurred while reading the file.");
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
                System.out.println("File stream closed.");
            }
            catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter file name: ");
        // String fileName = sc.nextLine();
        String PATH = "./LearnJava/Core/FileHandling/Example.txt";

        readFile(PATH); // function call
    }
}
