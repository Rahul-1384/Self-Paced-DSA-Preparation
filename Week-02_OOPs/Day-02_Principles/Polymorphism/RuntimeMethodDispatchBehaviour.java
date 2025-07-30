
class Animal{
    void sound(){
        System.out.println("Animal sounds");
    }
    static void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }

    // Method hiding
    // @Override    Not overridden i.e. why method hiding 
    static void eat(){
        System.out.println("Dog Eats");
    }
}

public class RuntimeMethodDispatchBehaviour {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();    // Called object type based method bcz of runtime method disp.
        obj.eat();  // Called reference type method bcz, the static methods cannot be overridden.
    }
}
