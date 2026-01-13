package LearnJava.Core.FileHandling;
import java.util.*;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        String PATH = "./LearnJava/Core/FileHandling/Example.txt";

        try(FileReader reader = new FileReader(PATH)) {
            int ch;
            while((ch = reader.read()) != -1 ){
                System.out.print((char)ch);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
