package Sort;

public class BubbleSort {

    /*
    * Time complexity:
    * - Best: O(n)
    * - Worse:O(n^2)
    * - Average: O(n^2)
    * - Stable
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

    public static void bubbleSortBetter(int[] nums){
        boolean flag; // check already sorted
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
        Example examples = new Example();
        int[] nums = new int[]{1,2,3,4}; // best cases
        bubbleSort(examples.nums);
        bubbleSortBetter(nums);
    }
}
