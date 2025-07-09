public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88};
        int target = 22;
        System.out.println(linearSearch(arr, target));
    }
    public static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}