public class SearchInRotatedArrays {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        System.out.println(searchInRotated(arr));
    }
    public static int searchInRotated(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return (start - 1 + arr.length) % arr.length;
    }
}
