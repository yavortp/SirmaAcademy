package Streams;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class bufferedStream {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\yavor\\Desktop\\Java\\SirmaBasic\\input.txt");

        //String path = "C:\\Users\\yavor\\Desktop\\Java\\SirmaBasic\\input.txt";
        String outputPath = "";

        try (BufferedReader in = new BufferedReader(new FileReader(path));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {
            int counter = 1;
            String line = in.readLine();
            while (line != null) {
                if (counter % 3 == 0) {
                    System.out.println(line);
                }
                counter++;
                line = in.readLine();
            }
        } catch (IOException e) {

        }
    }
}
