package q2;

public class Textbook extends Book {

    private final String title;
    private final double price;
    private final int edition;

    public Textbook(String bookTitle, double bookPrice, int editionNumber) {
        super(bookTitle, bookPrice);
        this.title = bookTitle;
        this.price = bookPrice;
        this.edition = editionNumber;
    }

    public int getEditionNumber() { return edition; }

    @Override
    public String getBookInfo() {
        return title + "-" + price + "-" + edition;
    }

    public boolean canSubstituteFor(Textbook referenceBook) {
        return title.equals(referenceBook.getTitle()) && edition >= referenceBook.getEditionNumber();
    }

}
