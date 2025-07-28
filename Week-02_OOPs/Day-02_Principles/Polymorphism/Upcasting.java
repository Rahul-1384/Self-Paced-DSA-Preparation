// Upcasting is assigning child class object to the parent class reference.
// Downcasting is converting parent class reference back to the child class reference
class Animal{
    int a = 10;
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
public class Upcasting {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Upcasting

        System.out.println(obj.a);  // Only parent class variables be accessed

        // But in case of methods, java use runtime method dispatch that decide
        // which method will be called based on the object [new Dog()]
        obj.sound();

        Dog dog = (Dog) obj;    // Downcasting
        System.out.println(dog.a);
    }
}
