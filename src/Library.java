import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books=new ArrayList<>();
    Book book=new Book();

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

            void issueBook(int issueId) {
                    boolean found =false;
                    for(Book book:books) {
                        if (book.id == issueId) {
                            found = true;
                            if (book.isBookIssued) {
                                System.out.println("Book Already issued");
                            } else {
                                book.isBookIssued = true;
                                System.out.println("book issued sucessfully");
                            }
                            break;

                        }
                    }

                 if (found==false){
                    System.out.println("provide a valid id");
                }
            }
        }




