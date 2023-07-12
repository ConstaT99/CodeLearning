package LeetCodeAns;

import Sort.Example;

public class Q300 {
    /*
    Given an integer array nums, return the length of the longest strictly increasing
            subsequence

    Example 1:

    Input: nums = [10,9,2,5,3,7,101,18]
    Output: 4
    Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
    Example 2:

    Input: nums = [0,1,0,3,2,3]
    Output: 4
    Example 3:

    Input: nums = [7,7,7,7,7,7,7]
    Output: 1


    Constraints:

            1 <= nums.length <= 2500
            -104 <= nums[i] <= 104
     */
    public static int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] temp = new int[nums.length];
        int i,j,m;
        int res = 0;
        for(int num : nums){
            i = 0; j = res;
            // binary search on temp list
            while(i != j){
                m = ( i + j )/2;
                if(temp[m] < num){
                    i = m + 1;
                }else {
                    j = m;
                }
            }

            temp[i] = num;
            if( i == res){ res++ ;}
        }

        return res;
    };

    public static void main(String[] args) {
        Example examples = new Example();
        int[] a = examples.Q300;
        int result;
        result = lengthOfLIS(a);
        System.out.println(result);
    }

}
