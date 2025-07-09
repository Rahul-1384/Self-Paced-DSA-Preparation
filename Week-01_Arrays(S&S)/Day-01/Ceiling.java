public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8,9,14,16,18};
        int target = 15;

        System.out.println(ceilingBinarySearch(arr, target));
    }
    public static int ceilingBinarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
