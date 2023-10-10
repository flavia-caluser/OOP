package Company.LibraryApp;

public class Client extends User{

    private String[] borrowedBookCodes;

    public Client(String name, Library library) {
        super(name, library);
    }
    //definesc un aitrbut al clasei Client de tip Library



    public String[] getBorrowedBookCodes() {
        return borrowedBookCodes;
    }

    public void setBorrowedBookCodes(String[] borrowedBookCodes) {
        this.borrowedBookCodes = borrowedBookCodes;
    }

    public boolean isBookAvailable (String ISBNCode){
        return true;
    }

    public void viewAvailableBooks(){

    }

    public boolean borrowBook(String ISBNCode){
        return true;
    }


}
