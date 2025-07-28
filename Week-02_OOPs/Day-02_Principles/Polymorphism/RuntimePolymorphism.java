// Also known as dynamic and method overriding.
// Supports inheritance
class Animal{
    void sound(){
        System.out.println("Animal sounds");
    }
}
class Dog extends Animal{
    int a = 20;
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();    // Known at runtime that overriden method is to be called.
    }
}
