package Streams;

import java.io.File;

public class FileExpample {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\yavor\\Desktop\\Java\\SirmaBasic\\input.txt");

        boolean isExisting = file.exists();
        long length = file.length();
        boolean isDirecotry = file.isDirectory();
        File[] newFile = file.listFiles();
    }
}
