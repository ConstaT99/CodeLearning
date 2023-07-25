package LeetCodeAns;

public class Q11 {
/*
*   You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

    Find two lines that together with the x-axis form a container, such that the container contains the most water.

    Return the maximum amount of water a container can store.

    Notice that you may not slant the container.



    Example 1:


    Input: height = [1,8,6,2,5,4,8,3,7]
    Output: 49
    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
    Example 2:

    Input: height = [1,1]
    Output: 1
*
* */

    public int maxArea(int[] height) {
        int idx1 = 0, idx2 = height.length - 1;
        int res = 0;
        int area;
        while(idx1 < idx2){
            area = Math.min(height[idx1],height[idx2]) * (idx2 - idx1);
            res = Math.max(area,res);
            if(height[idx1] < height[idx2]){
                idx1 ++;
            }else{
                idx2 --;
            }
        }
        return res;

    }
}
