public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int target = 5;
        System.out.println(searchIn2D(arr, target));
    }
    public static boolean searchIn2D(int[][] arr, int target){
        int start = 0;
        int end = arr[0].length - 1;
        while(start < arr.length && end >= 0){
            if(arr[start][end] == target) return true;
            if(arr[start][end] < target){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
}
