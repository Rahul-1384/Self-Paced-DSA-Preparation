import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int max = 0;
            for(int j=0;j<=arr.length-i-1;j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
