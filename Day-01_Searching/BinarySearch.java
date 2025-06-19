import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(mid == target){
                return mid;
            }
            if(mid < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
