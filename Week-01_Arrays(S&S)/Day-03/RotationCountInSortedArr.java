public class RotationCountInSortedArr {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        System.out.println(rotationCount(arr));
    }

    public static int rotationCount(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[end]){
                start = mid + 1;
            }else if(arr[mid] < arr[end]){
                end = mid;
            }else{
                end--;
            }
        }
        return start;
    }
}
