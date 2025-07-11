public class MaxInRotatedSortedArr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2};
        System.out.println(findMaximum(arr));
    }
    public static int findMaximum(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[end]){
                start = mid + 1;
            }else if(arr[mid] < arr[end]){
                end = mid;
            }else{
                end--;
            }
        }
        return (start - 1 + arr.length) % arr.length;
    }
}
