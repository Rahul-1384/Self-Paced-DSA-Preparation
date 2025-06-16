import java.util.Arrays;

public class Sortings{
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,3};
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length - i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        char ch = 'A';

        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }

        // Binary Search input
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(binarySearch(arr1, target));
    }

    // Binary Search Algorithm
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while(start < end){
            if(mid == target){
                return mid;
            }

            if(mid < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return mid;
    }
}