//Instructions:
//
//Create a class Book with attributes:
//
//title (String)
//
//author (String)
//
//price (double)
//
//Add a constructor to initialize all attributes.
//
//Create a displayBook() method that prints all book details.
//
//Create another class Library with:
//
//name (String)
//
//A list or array of Book objects (because a library can have many books).
//
//In the Library class:
//
//Add a constructor to set the library name and its list of books.
//
//Add a displayLibrary() method that prints the library name and calls displayBook() for each book.
//
//In the Main class:
//
//Create 2–3 Book objects.
//
//Pass them to a Library object.
//
//Call the displayLibrary() method to show all details.
//
//        💡 Hint:
//
//Use an array or ArrayList<Book> to store multiple books inside the library.
//Example structure:
//
//Book[] books = {b1, b2, b3};
//Library lib = new Library("City Library", books);


public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

     void displayBook(){
        System.out.println("book title: " + title + "by: " + author + "price: " + price);
        // return "Title: " + this.title + ", Author: " + this.author + ", Price: $" + this.price;
    }
}