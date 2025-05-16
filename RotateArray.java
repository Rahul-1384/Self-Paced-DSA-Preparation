import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int m = 2;
        rotateRight(arr, m);

        System.out.println(Arrays.toString(arr));
    }

    // Rotate the array by m positions
    public static void rotateRight(int[] arr, int m){
        int n = arr.length;
        m = m % n;
        int[] result = new int[n];
        
        // Rotate Right
        // for(int i=0;i<n;i++){
        //     result[(i+m)%n] = arr[i];
        // }

        // Rotate Left
        for(int i=0;i<n;i++){
            result[i] = arr[(i+m)%n];
        }
        for(int i=0;i<n;i++){
            arr[i] = result[i];
        }
    }
}
