package q3;

public class Review {

    private int rating;
    private String comment;

    public Review(int r, String c) {
        this.rating = r;
        this.comment = c;
    }

    public int getRating() { return rating; }

    public String getComment() { return comment; }

}
