package ua.ihorshulha.ht_09.structural.adapter;

public class AdapterArticleToStorage extends NewArticale implements StorageArticale {
    @Override
    public void insert() {
        saveArticle();
    }

    @Override
    public void update() {
        rewriteArticle();
    }

    @Override
    public void select() {
        getArticle();
    }

    @Override
    public void remove() {
        deleteArticle();
    }
}
