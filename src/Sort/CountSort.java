package Sort;

import java.util.Arrays;

public class CountSort {
    /*
     * Idea is to exchange space with Time
     * Time complexity:
     * - Best: O(n)
     * - Worse: No need to discuss
     * - Average: O(n+k) k : range of integer
     * Stabilization : stable
     * Space Complexity: O(k)
     * @param nums
     * */
    public static void countSort(int[] nums){
        int max = Integer.MIN_VALUE;
        // find max
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]] = count[nums[i]] + 1;
        }

        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[idx++] = i;
            }
        }
    }

    public static void main(String[] args) {
        Example examples = new Example();
        int[] nums = examples.nums;
        countSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
