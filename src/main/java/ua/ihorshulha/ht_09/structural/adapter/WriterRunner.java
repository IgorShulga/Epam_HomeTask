package ua.ihorshulha.ht_09.structural.adapter;

public class WriterRunner {
    public static void main(String[] args) {
        StorageArticale storageArticale = new AdapterArticleToStorage() ;

        storageArticale.insert();
        storageArticale.update();
        storageArticale.select();
        storageArticale.remove();
    }
}
