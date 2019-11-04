package Classworks.nov2.Files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadFile {
    ArrayList<String> read(String file) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        Stream<String> stream = Files.lines(Paths.get(file));
        stream.forEach(arrayList::add);
        return arrayList;
    }
}
