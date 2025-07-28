
class Animal{
    Animal(){
        System.out.println("Parent1 Constructor");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Parent2 Constructor");
    }
}
class Puppy extends Dog{
    Puppy(){
        System.out.println("Child Constructor");
    }
}