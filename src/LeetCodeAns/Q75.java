package LeetCodeAns;

public class Q75 {

    public static void sortColors(int[] nums) {
        if( nums == null || nums.length ==0){
            return;
        }
        int start = 0;
        int end = nums.length - 1;
        int idx = 0;
        while(idx <= end){
            if(nums[idx] == 0){
                swap(nums,idx++,start++);
            }else if(nums[idx] == 1){
                idx++;
            }else{
                swap(nums,idx,end--);
            }
        }
        return;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
