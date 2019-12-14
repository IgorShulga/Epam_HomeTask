package ua.ihorshulha.ht_07.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<String> readFromFile(String fileName) {
        List list = new ArrayList();
//        File file = new File(fileName);
//        if (file.exists()) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines().forEach((String line) -> {

                String[] array = line.split(Constants.SPLIT_OBJECTS);
                for (String value : array) {
                    list.add(value);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
//        } else {
//            System.out.println("File not exist.");
//        }
        return list;
    }

    public void writeToFile(String fileName, String dateFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(dateFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}