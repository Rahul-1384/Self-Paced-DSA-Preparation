public class CeilingFloor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int target = 5;
        System.out.println(ceiling(arr, target));
        System.out.println(floor(arr, target));
    }

    public static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return arr[start];
    }

    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return arr[end];
    }
}
