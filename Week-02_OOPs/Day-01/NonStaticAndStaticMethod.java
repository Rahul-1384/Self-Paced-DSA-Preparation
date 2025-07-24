public class NonStaticAndStaticMethod {
    public static void main(String[] args) {
        // Static method called without creating object
        staticMethod();

        // Non static method called by creating object
        NonStaticAndStaticMethod obj = new NonStaticAndStaticMethod();
        obj.nonStatic();
        
    }

    public void nonStatic(){
        System.out.println("This is non static method");
    }
    public static void staticMethod(){
        System.out.println("This is static method");
    }
}
