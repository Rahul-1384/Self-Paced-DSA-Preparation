
class Animal{
    Animal(){
        System.out.println("Parent Constructor");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Child1 Constructor");
    }
}
class Lion extends Animal{
    Lion(){
        System.out.println("Child2 Constructor");
    }
}