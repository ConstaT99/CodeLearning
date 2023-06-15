package Sort;

public class SelectSort {

    /*
     * Time complexity:
     * - Best: O(n^2)
     * - Worse:O(n^2)
     * - Average: O(n^2)
     * - Unstable
     * Space complexity: O(1)
     * @param nums
     * */
    public static void selectSort(int[] nums){
        for(int i = 0; i < nums.length; i ++){
            int minIndex = i;
            for( int j = i + 1; j < nums.length ;j ++){
                if( nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            if( minIndex != i){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5,4,6,2,1,7};
        selectSort(nums);
        for( int num: nums){
            System.out.println(num);
        }
    }
}
