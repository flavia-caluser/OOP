package Company.BackpackApp;

public class Book {
    String title;
    int numberOfPages;
    int weight;

    public Book(String title, int numberOfPages, int weight) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
