public class PeakInMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,7,7,10,15,2,1};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            // To handle duplicate values
            if(arr[mid] == arr[mid + 1]){
                if(arr[mid] > arr[mid - 1]){
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }


            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return arr[start];
    }
}
