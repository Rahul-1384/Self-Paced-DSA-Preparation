public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        boolean isAscending = false;
        if(arr[0] < arr[arr.length - 1]) isAscending = true;

        System.out.println(findTarget(arr, target, isAscending));
    }
    public static int findTarget(int[] arr, int target, boolean isAscending){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            if(isAscending){
                if(arr[mid] > target) end = mid - 1;
                else start = mid + 1;
            }else{
                if(arr[mid] > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}