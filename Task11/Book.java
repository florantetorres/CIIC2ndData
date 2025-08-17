public class Book extends BookPart{
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

    void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

