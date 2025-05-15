// Linear Search Algo

import java.util.*;
public class Lec_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Target element to be found in Array: ");
        int target = sc.nextInt();
        // Linear Search
        System.out.println(LinearSearch(arr, target));

        // Minimum number
        System.out.println(minimumNumber(arr));
    }
    public static int LinearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int minimumNumber(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
