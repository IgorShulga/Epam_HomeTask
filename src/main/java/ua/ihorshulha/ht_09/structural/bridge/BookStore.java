package ua.ihorshulha.ht_09.structural.bridge;

public class BookStore extends PaperBook {

    public BookStore(BookWriter writer) {
        super(writer);
    }

    @Override
    public void writeBook() {
        System.out.println("Book store is waiting new book for sale ...");
        writer.wtiteBook();
    }
}
