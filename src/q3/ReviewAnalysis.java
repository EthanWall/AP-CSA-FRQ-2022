package q3;

import java.util.ArrayList;
import java.util.Arrays;

public class ReviewAnalysis {

    private Review[] allReviews;

    public ReviewAnalysis(Review[] reviews) {
        this.allReviews = reviews;
    }

    public double getAverageRating() {
        int total = 0;
        for (Review r : allReviews) {
            total += r.getRating();
        }

        return (double) total / allReviews.length;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<>();

        for (int i = 0; i < allReviews.length; i++) {
            String c = allReviews[i].getComment();
            if (!c.contains("!"))
                continue;

            if (!c.endsWith(".") || !c.endsWith("!"))
                c += ".";

            comments.add(i + "-" + c);
        }

        return comments;
    }

}
