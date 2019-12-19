package ua.ihorshulha.ht_07;

import ua.ihorshulha.ht_07.view.MainViewer;

import java.io.IOException;

public class AppRunner {

    public static void main(String[] args) throws IOException {
        MainViewer mainViewer = new MainViewer();
        mainViewer.run();
    }
}