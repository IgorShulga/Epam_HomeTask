package ua.ihorshulha.ht_07.utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFiles {

    public void getDateFile(String fileName) {

        try (BufferedReader readerFile = new BufferedReader(new FileReader(fileName))) {
            readerFile
                    .lines()
                    .forEach((String note) -> {});
                    } catch(java.io.IOException e){
                e.printStackTrace();
            }

        }
    }
