package Streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) {

        Path inputPath = Paths.get("C:\\Users\\yavor\\Desktop\\Java\\SirmaBasic\\input.txt");
        Path outputPath = Paths.get("C:\\Users\\yavor\\Desktop\\Java\\SirmaBasic\\output.txt");

        List<String> lines = Files.readAllLines(inputPath);
        Files.write(outputPath, lines);
    }
}
