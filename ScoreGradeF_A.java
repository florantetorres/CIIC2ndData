import java.util.Scanner;
public class ScoreGradeF_A {
public static void main(String[] args) {
    
try (Scanner scanner = new Scanner(System.in)) {
System.out.println("Enter Student Name: ");
String name = scanner.nextLine();
System.out.println("Enter Address: ");
String address = scanner.nextLine();
System.out.println("Enter Age: ");
int Age = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your gender (Male/Female): ");
        String gender = scanner.next().trim();
        String title;
        if (gender.equalsIgnoreCase("Male")) {
            title = "Mr.";
        } else if (gender.equalsIgnoreCase("Female")) {
            title = "Ms.";
        } else {
            title = "Invalid input";
        }
       
System.out.println("Enter your score (0-100):");
int score = scanner.nextInt();

switch(score / 10) {
case 10: 
case 9:
System.out.println(title + " " + name + " Grade is A");
System.out.println("Resident At: " + address);
System.out.println("Years Old " + Age);
break;
case 8:
System.out.println(title +  " " + name + " Grade is B");
System.out.println("Resident At: " + address);
System.out.println("Years Old " + Age);
break;
case 7:
System.out.println(title + " "+ name + " Grade is C");
System.out.println("Resident At: " + address);
System.out.println("Years Old " + Age);
break;
case 6:
System.out.println(title +" "+ name + " Grade is D");
System.out.println("Resident At: " + address);
System.out.println("Years Old " + Age);
break;
default: 
System.out.println(title +" "+ name + " Grade is F");
System.out.println("Resident At: "  + address);
System.out.println("Years Old " + Age);
break;

}
 scanner1.close();
}
}
}