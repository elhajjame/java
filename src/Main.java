//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Fellowship of the Ring","J. R. R. Tolkie", 99.00);
        Book book2 = new Book("The Two Towers", "J. R. R. Tolkie", 199.00);
        Book book3 = new Book("The Return of the King", "J. R. R. Tolkie", 150.00);

        Book [] books ={book1, book2, book3};

        //System.out.println(book1.displayBook());
        Library library = new Library("Beni Mellal library", books);
        library.displayLibrary();

        // so key points :
        //** Books can exist independently (b1, b2, b3) → aggregation.
        //
        //** Library uses the books but doesn’t destroy them if deleted.


        Teacher teacher1 = new Teacher("mohammed", "java", 10000);
        Teacher teacher2 = new Teacher("meryam", "javascript", 9000);
        Teacher teacher3 = new Teacher("said", "php", 12000);
        Teacher teacher4 = new Teacher("malika", "soft skills", 7000);

        Teacher [] teachers ={teacher1, teacher2, teacher3, teacher4};

        School school = new School("Enna", teachers);
        school.displaySchool();

        Computer comp = new Computer();
        comp.displayComputer();
    }

}
