class Animal{

}
class Dog extends Animal{

}
class Extra{

}

public class InstanceOfKeyword{
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Object);
        // The below line will give error
        // System.out.println(d instanceof Extra);
    }
}
