package session3;

public class Dog extends Animal{
    public int year;

    public Dog() {

    }

    public void eat(){
        System.out.println("Eat...");
    }
    public void run(){
        super.run();
        this.name = "abc";
        System.out.println("Dog run...");
    }
}
