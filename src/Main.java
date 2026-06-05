import java.util.Scanner;

class main{
    static void main(String[] args) {
        int choice ;
        do{
            System.out.println("1.Add book");
            System.out.println("2.View book");
            System.out.println("3.Search book");
            System.out.println("4.Issue book");
            System.out.println("5.Return book");
            System.out.println("6.Exit");
            Scanner sc=new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("book is adding");
                    break;
                case 2:
                    System.out.println("book is viewing");
                    break;
                case 3:
                    System.out.println("Searching book");
                    break;
                case 4:
                    System.out.println("issuing book");
                    break;
                case 5:
                    System.out.println("return Book Succesfully");
                    break;
                case 6:
                    System.out.println("exiting the system");
                    break;
                default:
                    System.out.println("Option Not available");
            }
        }while(choice<=6);
    }
    }
