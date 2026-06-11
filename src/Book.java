public class Book {
    int id;
    String book_name;
    String author;
    Boolean isBookIssued= false;

    Book(int id, String book_name, String author ){
        this.id=id;
        this.book_name=book_name;
        this.author=author;

    }

    void displayBook(){
        System.out.println("id ="+ id);
        System.out.println("Name ="+ book_name);
        System.out.println("Author ="+author );
        if (isBookIssued==true){
            System.out.println("book already issued");
        }
        else {
            System.out.println("book available");
        }

    }


}


