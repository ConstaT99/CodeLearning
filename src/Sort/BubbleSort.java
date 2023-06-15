package Sort;

public class BubbleSort {

    /*
    * Time complexity:
    * - Best: O(n)
    * - Worse:O(n^2)
    * - Average: O(n^2)
    * @param nums
    * */

    public static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            for( int j = nums.length - 1; j > i; j --){
                if( nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }

    public static void betterBubbleSort(int[] nums){
        boolean flag = false; // check already sorted
        for (int i = 0; i < nums.length - 1; i++){
            flag = false;
            for( int j = nums.length - 1; j > i; j --){
                if( nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,3,9,4,7,6,1,3,8};
        int[] nums2 = new int[]{1,2,3,4}; // best cases
        bubbleSort(nums);
    }
}
