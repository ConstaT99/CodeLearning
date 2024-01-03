package LeetCodeAns;

public class Q80 {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int count = 1;
        if(nums.length <= 1){
            return idx + 1;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[idx] != nums[i]){
                idx++;
                nums[idx] = nums[i];
                count = 1;
            }else if (nums[idx] == nums[i] && count < 2 && idx != i){
                idx ++;
                nums[idx] = nums[i];
                count++;
            }
        }
        return idx + 1;
    }
}
