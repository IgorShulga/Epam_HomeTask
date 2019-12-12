package ua.ihorshulha.ht_07.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

public class ReadFiles {

    public Map<Long, Object> getDateFile(String fileName) {

        try (BufferedReader readerFile = new BufferedReader(new FileReader(fileName))) {
            readerFile
                    .lines()
                    .forEach((String note) -> {
//                        TODO write parser
                    });
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
