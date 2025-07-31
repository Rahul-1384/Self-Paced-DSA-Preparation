abstract class Animal{
    // Can have static, final, and static final variables
    static int a;
    final int b = 10;
    static final int c = 10;

    // Cannot have static abstract method
    abstract void sound();
    static void eat(){
        System.out.println("Animal eats");
    }
    // static abstract void run();


}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class Main{
    public static void main(String[] args) {
        // Cannot intantiate the abastract class
        // Animal obj = new Animal();
        
        Animal obj = new Dog();
        obj.sound();
    }
}
