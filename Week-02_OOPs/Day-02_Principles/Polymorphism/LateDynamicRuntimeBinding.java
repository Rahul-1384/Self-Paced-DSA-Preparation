
class Animal{
    void sound(){
        System.out.println("Animal Sounds");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class LateDynamicRuntimeBinding {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
