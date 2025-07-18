public class InternalWorking {
    public static void main(String[] args) {
        String a = "Rahul";
        String b = a;
        a = a + "Rajput";
        System.out.println(b);

        // Below both a1 & b1 are pointing to the same object in pool
        String a1 = "Rahul";
        String b1 = "Rahul";

        // Below a2 & b2 are pointing to different object inside the heap but outside the pool
        String a2 = new String("Rahul");
        String b2 = new String("Rahul");

    }
}
