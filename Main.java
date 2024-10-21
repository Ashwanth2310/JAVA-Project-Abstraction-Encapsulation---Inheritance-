import java.util.Scanner;

 abstract class LibraryItem{
    protected String title,author;
    protected int id;

    public LibraryItem(String title, String author,int id ){
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public abstract void display();
 }

 class Comic extends LibraryItem{
    private int pageCount;

    public Comic(String title,String Author,int id,int pageCount){
        super(title, Author, id);
        this.pageCount = pageCount;
    }
    @Override
    public void display(){
        System.out.println("Comic: " + title + " by " + author + ", ID: " + id + ", Paiges: " + pageCount);
    }
 }

 class Magazine extends LibraryItem{
    private int issue;
    public Magazine(String title, String author, int id,int issue){
        super(title, author, id);
        this.issue = issue;
    }
    @Override
    public void display() {
        System.out.println("Magazine: " + title + " by " + author + ", ID: " + id + ", Issue: " + issue);
    }
 }

 public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an item to add to the library: ");
        System.out.println("1. Comic");
        System.out.println("2. Magazine");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the title: ");
        String title = sc.nextLine();
        System.out.println("Enter name of Author: ");
        String author = sc.nextLine();
        System.out.println("Enter ID: ");
        int id = sc.nextInt();

        LibraryItem item = null;

        if (ch == 1){
            System.out.println("Enter number od pages: ");
            int pagecnt = sc.nextInt();
            item = new Comic(title, author, id, pagecnt);
        }
        else if(ch == 2){
            System.out.println("Enter the issue number: ");
            int issnum = sc.nextInt();
            item = new Magazine(title, author, id, issnum);
        }
        else{
            System.out.println("Invalid choice :/");
        }

        if (item != null){
            item.display();
        }
    }
 }