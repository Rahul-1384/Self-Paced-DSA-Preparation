import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7,8,9,10};
        int target = 1;
        System.out.println(binarySearch(arr, target));

        int[][] matrix = {
            {1,2,3,4},
            {2,4,9,15},
            {5,10,20,25}
        };
        System.out.println(Arrays.toString(searchInMatrix(matrix, 9)));
    }
    public static int[] searchInMatrix(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            if(arr[row][col] < target){
                row++;
            }else{
                col++;
            }
        }
        return new int[]{-1, -1};
    }


    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
