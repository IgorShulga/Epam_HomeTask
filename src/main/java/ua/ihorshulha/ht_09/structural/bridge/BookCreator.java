package ua.ihorshulha.ht_09.structural.bridge;

public class BookCreator {
    public static void main(String[] args) {
        PaperBook [] books = {
                new PublishingHouse(new ScienceWriter()),
                new BookStore(new FantasyWriter())
        };

        for(PaperBook book : books){
            book.writeBook();
        }
    }
}
