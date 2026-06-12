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

    public void searchBooks(int id){
        if(books.isEmpty()){
            System.out.println("no Book In the Library");
        }else {
        for (Book book:books) {
            if (book.id == id) {
                System.out.println("book found");
            } else {
                System.out.println("book not available");
            }
        }
        }

    }
    }

