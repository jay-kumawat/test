public class Book {
    String isbn;
    String title;
    String author;
    int publishYear;
    int totCopi; //Total Copies
    int borrCopi; //Borrowed Copies


    public Book(String isbn, String title, String author, int publishYr, int totalCopies){
        this.isbn =  isbn;
        this.title = title;
        this.author = author;
        this.publishYear = publishYr;
        this.totCopi =  totalCopies;
        this.borrCopi = 0;
    }

    

}
