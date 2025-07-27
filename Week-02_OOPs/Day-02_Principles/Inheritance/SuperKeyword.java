// //  Super is a reference variable used to refer the immediate parent class members

// Uses of super
// 1) Access parent class variables when parent and child class have same name of variables.
class Animal1{
    String type = "Animal";
}

class Dog1 extends Animal1{
    String type = "Dog";
    void displayType(){
        System.out.println(super.type); // Calls parent class variable
    }
}

// 2) Access parent class methods when child overrides parent class methods
class Animal2{
    void sound(){
        System.out.println("Animal sounds");
    }
}
class Dog2 extends Animal2{
    @Override
    void sound(){
        super.sound();  // Calls parent class method
        System.out.println("Dog Barks");
    }
}

// 3) Access parent class constructor
class Animal3{
    Animal3(){
        System.out.println("Animal Constructor");
    }
}
class Dog3 extends Animal3{
    Dog3(){
        super();    // Calls parent class constructor
        System.out.println("Dog Constructor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog1 obj1 = new Dog1();
        obj1.displayType();

        Dog2 obj2 = new Dog2();
        obj2.sound();

        Dog3 obj3 = new Dog3();
    }
}
