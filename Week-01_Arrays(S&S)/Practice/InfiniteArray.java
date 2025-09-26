public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(findRange(arr, target));
    }
    public static int findRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, start, end, target);
    }
    public static int binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
