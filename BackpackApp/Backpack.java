package Company.BackpackApp;

public class Backpack {

    Book[] booksList;
    int maxWeight;
    int currentWeight;
    int numberOfBooks;

    public Backpack(Book[] booksList, int maxWeight, int currentWeight, int numberOfBooks) {
        this.booksList = booksList;
        this.maxWeight = maxWeight;
        this.currentWeight = currentWeight;
        this.numberOfBooks = numberOfBooks;
    }

    public Book[] getBooksList() {
        return booksList;
    }

    public void setBooksList(Book[] booksList) {
        this.booksList = booksList;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getTotalPages(){
        int totalPagesNr =0;
        if (numberOfBooks==0){
            return -1;
        }
        for (int i = 0; i < numberOfBooks; i++) {
            totalPagesNr += booksList[i].numberOfPages;
        }
        return totalPagesNr;
    }

    public void printCurrentBooks(){
        if (numberOfBooks==0){
            System.out.println("Nu sunt carti in acest ghiozdan");
        }
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(booksList[i].toString());
        }
    }

}
