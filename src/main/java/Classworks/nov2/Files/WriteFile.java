package Classworks.nov2.Files;

import java.io.*;
import java.util.ArrayList;

public class WriteFile {
    public void write(ArrayList<String> arrayList, String file) throws IOException {
        PrintWriter pw = new PrintWriter(
                new FileWriter(
                        new File(file)));
        arrayList.forEach(pw::println);
        pw.close();
    }
}
