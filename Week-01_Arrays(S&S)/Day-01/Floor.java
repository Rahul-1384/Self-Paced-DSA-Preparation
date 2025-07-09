public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        int target = 6;

        System.out.println(floorBinarySearch(arr, target));
    }
    public static int floorBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
