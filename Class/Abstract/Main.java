package Class.Abstract;
/**
 * Main
 */
abstract class Animal{
    // abstract method
    public abstract void animalsound();
}

class Pig extends Animal{
    public void animalsound(){
        System.out.println("Wee Wee");
    }
}
public class Main {
    public static void main(String[] args) {
        Pig mypig = new Pig();
        mypig.animalsound();
    }
    
}