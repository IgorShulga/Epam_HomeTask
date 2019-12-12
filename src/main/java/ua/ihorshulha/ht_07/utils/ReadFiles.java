package ua.ihorshulha.ht_07.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ReadFiles {

    public Map<Long, Object> getDateFile(String fileName) {

        try (BufferedReader readerFile = new BufferedReader(new FileReader(fileName))) {
            Files.lines(Paths.get(Constants.SET_PATH, fileName), StandardCharsets.UTF_8)
                    .forEach((String note) -> {
//                        TODO write parser
                    });
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
