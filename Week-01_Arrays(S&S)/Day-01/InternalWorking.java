import java.util.Arrays;

public class InternalWorking {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};  // New object created
        int[] b = {1,2,3,4,5};  // New object created
        
        System.out.println(a==b);   // Checks for reference only

        System.out.println(Arrays.equals(a, b));    // Checks the value only
    }
}
