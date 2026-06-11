import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("book added succesfully");
    }
    public void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("no book found");
        }
        else {
            for (Book book: books){
                book.displayBook();
            }
        }
    }
    }

