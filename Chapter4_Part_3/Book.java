import java.util.*;
public class Book {
    String title;
    String author;
    int yearPublished;
    double price;
    Book(String a, String b, int yp, double pr) {
        this.title = a;
        this.author = b;
        this.yearPublished = yp;
        this.price = pr;
    }
        public void display(int sequenceNumber) {
    System.out.println("Book " + sequenceNumber + ":");
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("Year Published: " + this.yearPublished);
    System.out.println("Price: $" + this.price);
    System.out.println(); // Empty line for better formatting
    }
}

class Main {
    public static void main(String[] args) {
      
        List<Book> lists=new ArrayList<Book>();
       
       String[] a={"Loyalty","Trust","Faith","Love"};
       String[] b={"Daniel","Mathew","John","Ezekiel"};
       int[] yp={1999,2006,2007,2019};
         double[] pr={19.99,29.99,39.99,49.99};
         for(int i=0;i<4;i++)
         {
              Book s=new Book(a[i],b[i],yp[i],pr[i]);
              lists.add(s);
         }
         
         for(int i=0;i<4;i++){
lists.get(i).display(i+1);
         }
}
}