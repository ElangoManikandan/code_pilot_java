package Tasks.Aggregation;

class Book{
    String title;
    String author;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
}
class Library{
    String libraryName;
    Book book;
    Library(String libraryName,Book book){
        this.libraryName=libraryName;
        this.book=book;
    }
    void bookDetails(){
        System.out.println("Book Name : "+book.title+"\nBook Author: "+book.author+" \nLibrary Name :"+libraryName);
    }
}




public class Main {
    public static void main(String[] args) {
        Book book1=new Book("Harry Potter","J.K.Rowling");
        Library library=new Library("Kannimara Library",book1);
        library.bookDetails();
    }
}
