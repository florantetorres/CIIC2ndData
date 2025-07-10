package Chapter2_Part_1;

public class Task3 {
    public static void main(String[] args) {
        
String a = "Wow"; // changed to string literal
String b = "Wow";
String c = a + "!"; // changed to make b3 true
String d = c; 
boolean b1 = a == b; // true
boolean b2 = d.equals(b + "!"); // true
boolean b3 = !c.equals(a); // true
if (b1 && b2 && b3) {
    System.out.println("Success!");
}
}
}
