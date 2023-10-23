// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LibraryCatalog catalog = new LibraryCatalog();

      // addBook section
       catalog.addBook(new Book("Rich Dad, Poor Dad", "Robert Kiyosaki", "389303-383939", "Finance"));
       catalog.addBook(new Book( "Wasteland", "T.S Eliot", "234576-546783", "inspiration" ));
       catalog.addBook(new Book("Romeo and Juliet", "William Shakespare", "345698-567234", "love"));
       catalog.addBook(new Book("Wealth of Nations","Adam Smith", "43256678-652356", "finance"));
       catalog.addBook(new Book("Shape of things to come", "H.G Wells","46336272-7478997","experience"));

        catalog.listBookArray(); // addBook for array
        catalog.listBooksArrayList();// addBook for arraylist


        catalog.removeBook("Romeo and Juliet");//To remove a book
        catalog.listBookArray();//remove a book


        catalog.searchBook("things fall apart");



    }
}