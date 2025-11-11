import java.util.ArrayList;
public class Library {
    String name;
    Book [] books;
    Library(String name, Book [] books){
        this.name = name;
        this.books = books;
    }
    void displayLibrary(){
        System.out.println("Library: " + name);
        System.out.println("Books available:");
        for(int i = 0; i < books.length; i++){
            books[i].displayBook();
        }
    }
}
