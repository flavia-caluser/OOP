package Company.LibraryApp;

public class Library {
    private Book[] books;

    private int numberOfBooksAdded;

    public Library(Book[] books, int numberOfBooksAdded) {
        this.books = books;
        this.numberOfBooksAdded = numberOfBooksAdded;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getNumberOfBooksAdded() {
        return numberOfBooksAdded;
    }

    public void setNumberOfBooksAdded(int numberOfBooksAdded) {
        this.numberOfBooksAdded = numberOfBooksAdded;
    }

    public boolean isBookAdded(String ISBNCode){
        for (int i = 0; i < numberOfBooksAdded; i++) {
            if(books[i].getISBNCode().equals(ISBNCode)){
                return true;
            }
        }
        return false;
    }

    public Book getBookByISBNCode (String ISBNCode){
        for (int i = 0; i < numberOfBooksAdded; i++) {
            if(books[i].getISBNCode() == ISBNCode){
                return books[i];
            }
        }
        return null;
    }

    public boolean addBook(String ISBNCode){
        int a;
        if (isBookAdded(ISBNCode) == true){
            a= getBookByISBNCode(ISBNCode).getTotalNumberOfCopies();
            a++;
        }
        else{
            books[numberOfBooksAdded] = getBookByISBNCode(ISBNCode);
            setNumberOfBooksAdded(numberOfBooksAdded++);
        }
        return true;
    }

    public boolean deleteBook(String ISBNCode){
        if (isBookAdded(ISBNCode) == false){
            return false;
        }
        else{
            int position = 0;
            for (int i = 0; i < numberOfBooksAdded; i++) {
                if (books[i].getISBNCode().equals(ISBNCode)){
                    position = i;
                    break;
                }
            }
            for (int i = position; i < numberOfBooksAdded - 1; i++) {
                books[i] = books[i+1];
            }
            setNumberOfBooksAdded(numberOfBooksAdded--);
        }
        return true;
    }



}


