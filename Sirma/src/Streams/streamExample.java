package Streams;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class streamExample {
    public static void main(String[] args) {

        //Character Stream - reads line by line

        String path = "C:\\Users\\yavor\\Desktop\\Java\\SirmaBasic\\input.txt";

        FileReader reader = new FileReader(path);

        Scanner scanner = new Scanner(new FileReader(path));   //scanner can read from file


        //Byte Stream - reads char by char

        String path = "C:\\Users\\yavor\\Desktop\\Java\\SirmaBasic\\input.txt";

        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                // souf("%s ". oneByte) - will print ASCII values
                // souf("%s ". (char)oneByte) - will print each char (casted ascii values to chars)
                oneByte = in.read();
            }

        } catch (IOException e) {
            System.out.println("Caught the exception");
            e.printStackTrace();
        }



    }
}
