package ua.ihorshulha.ht_09.structural.bridge;

public class PublishingHouse extends PaperBook {

    public PublishingHouse(BookWriter writer) {
        super(writer);
    }

    @Override
    public void writeBook() {
        System.out.println("Publishing house is waiting new book for publishing ...");
        writer.wtiteBook();
    }
}
