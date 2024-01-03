package LeetCodeAns;

public class Q26 {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int head = nums[0];
        for(int i = 0; i < nums.length; i ++){
            if(head <= nums[i]){
                nums[idx] = nums[i];
                idx ++;
                head = nums[i] + 1;
            }
        }
        return idx;
    }
}
