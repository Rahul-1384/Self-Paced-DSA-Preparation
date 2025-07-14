import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIdx = arr[i] - 1;
            if(i == correctIdx){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            }
        }
        return;
    }
}
