public class Comparison {
    public static void main(String[] args) {
        // Below both a & b point to the different objects created in heap not in pool
        String a = new String("Rahul");
        String b = new String("Rahul");

        System.out.println(a==b);   // Checks the reference
        System.out.println(a.equals(b));    // Checks the value only
    }
}
