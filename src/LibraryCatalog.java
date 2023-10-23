import java.util.ArrayList;

public class LibraryCatalog {
    private ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(String title){

        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getTitle() == title){
                books.remove(i);
                break;

            }
        }
    }

    public Book searchBook(String title){

        for (Book book : books){
            if (book.getTitle() == title){
                System.out.println("Book found");
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }

    public void listBooksArrayList(){
        System.out.println("Books in the catalog using an arraylist: \n");
        for (Book book: books){
            System.out.println(book);
        }

    }

    public void listBookArray(){
        System.out.println("Books in the catalog using an array: \n");
        for (int i = 0; i < books.size(); i++){
            if (books.get(i) != null){
                System.out.println(books.get(i));
            }
        }
    }


}
