public class Polymorphism {
    // Constructor is behaving in two forms based on the parameters.
    // The act of representing the same thing in different ways is polymorphism
    Polymorphism(){
        System.out.println("Non param");
    }
    Polymorphism(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
    }
}
