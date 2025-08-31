public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
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
        return infiniteArray(arr, target, start, end);
    }

    public static int infiniteArray(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
