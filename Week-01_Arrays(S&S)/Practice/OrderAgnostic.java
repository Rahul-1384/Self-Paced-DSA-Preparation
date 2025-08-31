public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(orderAgnostic(arr, target));
    }
    public static int orderAgnostic(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = true;
        if(arr[start] > arr[end]) isAscending = false;
        while(start <= end){
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
