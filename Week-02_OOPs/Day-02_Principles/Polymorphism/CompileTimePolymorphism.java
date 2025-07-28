// Also known as method overloading and static polymorphism
public class CompileTimePolymorphism {
    void add(int a, int b){
        System.out.println(a+b);;
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);;
    }
    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.add(2,2);   // Known at compile time that which constructor is being called
        obj.add(2,2,2);
    }
}
