package Company.LibraryApp;

public class Admin extends User{


    public Admin(String name, Library library) {
        super(name, library);
    }

    public boolean addBook(Book book){
        //daca exista deja in biblioteca ii modific nr-ul de copii
        //daca nu exista in biblioteca o pun in biblioteca si cresc nr-ul de carti din biblioteca
        if (getLibrary().isBookAdded(book.getISBNCode()) == false){
            getLibrary().getBooks()[getLibrary().getNumberOfBooksAdded()] = book;
            getLibrary().setNumberOfBooksAdded(getLibrary().getNumberOfBooksAdded() + 1);
            return true;
        }
        else{
            book.setTotalNumberOfCopies(book.getTotalNumberOfCopies() + 1);
            return true;
        }
    }


    public boolean deleteBook(String ISBNCode){
        //parcurg lista de carti si daca nu o gasesc arunc exceptie;
        //daca o gasesc scad nr de carti si mut cartile de dupa ea cu o pozitie mai mica(nu in ordinea asta);
        if(getLibrary().deleteBook(ISBNCode) == true) {
            return true;
        }
        return false;
    }

    public boolean deleteBook(String ISBNCode, int numberOfCopies) throws Exception{
        Book foundBook = getLibrary().getBookByISBNCode(ISBNCode);
        if(foundBook.getTotalNumberOfCopies() < numberOfCopies)
            throw new Exception("Exista doar " + numberOfCopies + "copii ale acestei carti");
        else {
            foundBook.setTotalNumberOfCopies(foundBook.getTotalNumberOfCopies() - numberOfCopies);
        }
        return true;
    }

    public void listAllBooks(){
        System.out.println(getLibrary().getBooks().toString());

    }
}
