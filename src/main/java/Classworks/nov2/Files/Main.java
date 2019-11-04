package Classworks.nov2.Files;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomStrings randStrings = new RandomStrings();
        ArrayList<String> arrayList =  randStrings.create(33, 20, 30);
        WriteFile writeFile = new WriteFile();
        writeFile.write(arrayList, "src/main/java/Classworks/nov2/Files/File.txt");
        ReadFile readFromFile = new ReadFile();
        ArrayList<String> sortedArrayList = readFromFile.read("src/main/java/Classworks/nov2/Files/File.txt");
        sortedArrayList.sort((s1, s2) -> (s1.length() - s2.length()));
        writeFile.write(sortedArrayList, "src/main/java/Classworks/nov2/Files/Sorted.txt");
    }
}
