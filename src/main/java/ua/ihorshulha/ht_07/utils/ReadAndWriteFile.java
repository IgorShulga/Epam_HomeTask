package ua.ihorshulha.ht_07.utils;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<String> readFromFile(String fileName) {
        List list = new ArrayList();
        isExistFileForReadAndWrite(fileName);
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
        return list;
    }

    private void isExistFileForReadAndWrite(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                throw new ApplicationException(fileName + " not exist.");
            } catch (ApplicationException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeToFile(String fileName, String dateFile) {
        isExistFileForReadAndWrite(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(dateFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}