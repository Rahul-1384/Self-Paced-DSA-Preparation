public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }
    public static int splitArray(int[] nums, int k){
        int start = 0;
        int end = 0;

        for(int num : nums){
            start = Math.max(start, num);
            end += num;
        }

        while(start < end){
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start) / 2;

            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
