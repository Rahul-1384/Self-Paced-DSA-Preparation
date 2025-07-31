class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog Contructor");
    }
}

public class SuperInternalWorking{
    public static void main(String[] args) {
        Animal obj = new Dog();
    }
}