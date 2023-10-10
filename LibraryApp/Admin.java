package Company.LibraryApp;

public class Admin extends User{


    public Admin(String name, Library library) {
        super(name, library);
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



        return true;

    }
}
