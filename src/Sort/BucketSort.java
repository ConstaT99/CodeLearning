package Sort;

import java.util.*;

public class BucketSort {

    /*
     * Idea is to exchange space with Time
     * Time complexity:
     * - Best: O(n)
     * - Worse: No need to discuss
     * - Average: O(n + c) c = n * (logn - logm) m = bucket number
     * Stabilization : stable
     * Space Complexity: O(n + m)
     * @param nums
     * */
    public static void bucketSort(int[] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i],min);
        }
        int bucketNum = (max - min ) / nums.length + 1;
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < bucketNum; i++) {
            bucket.add(new ArrayList<>());
        }
        for (int i = 0; i < nums.length; i++) {
            int num = (nums[i] - min) / nums.length;
            bucket.get(num).add(nums[i]);
        }
        for (int i = 0; i < bucket.size(); i++) {
            Collections.sort(bucket.get(i));
        }
        int idx = 0;
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                nums[idx] = bucket.get(i).get(j);
                idx ++;
            }
        }
    }

    public static void main(String[] args) {
        Example examples = new Example();
        int[] nums = examples.nums;
        bucketSort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
