package Task16;

// Define the Animal interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
// Create a Gorilla class that implements the Animal interface
class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("put gorilla food into cage");
            return true;
        } else {
            System.out.println("Not time to eat yet.");
            return false;
        }
    }
    @Override
    public void groom() {
        System.out.println("lather, rinse, repeat");
    }
    @Override
    public void pet() {
        System.out.println("pet at your own risk");
    }
}
public class Main {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
