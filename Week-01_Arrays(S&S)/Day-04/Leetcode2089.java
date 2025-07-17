import java.util.ArrayList;
import java.util.List;

public class Leetcode2089 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        List<Integer> list = new ArrayList<>();
        list = targetIndices(nums, target);
        System.out.println(list);
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}