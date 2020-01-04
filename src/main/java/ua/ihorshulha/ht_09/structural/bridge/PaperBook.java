package ua.ihorshulha.ht_09.structural.bridge;

public abstract class PaperBook {
    protected BookWriter writer;

    public PaperBook(BookWriter writer) {
        this.writer = writer;
    }

    public abstract void writeBook();
}
