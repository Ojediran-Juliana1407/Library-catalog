public class Book {
    private String title;
    private String author;
    private String iSBN;
    private String genre;

    public Book(String title, String author,String iSBN, String genre){
        this.title = title;
        this.author = author;
        this.iSBN = iSBN;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return iSBN;
    }
    public String getGenre(){
        return genre;
    }

    @Override
    public String toString(){
        return "Title: " + title + ", Author: " + author + ", ISBN: " + iSBN + ", Genre: " + genre;
    }




}
