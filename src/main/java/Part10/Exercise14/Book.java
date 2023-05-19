package Part10.Exercise14;

public class Book {

    private String bookName;
    private int recommendedAge;

    public Book(String bookName, int recommendedAge) {
        this.bookName = bookName;
        this.recommendedAge = recommendedAge;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getRecommendedAge() {
        return this.recommendedAge;
    }
}