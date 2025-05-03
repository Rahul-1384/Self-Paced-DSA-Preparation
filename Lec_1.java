import java.util.*;

public class Lec_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {1,2,3,4,5};
        // int[][] arr2D = {{1,2,3},{4,5,6}};
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.deepToString(arr2D));

        // // 2D Array
        // int[][] arr1 = new int[3][3];
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[i].length;j++){
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i=0;i<arr1.length;i++){
        //     System.out.println(Arrays.toString(arr1[i]));
        // }

        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
