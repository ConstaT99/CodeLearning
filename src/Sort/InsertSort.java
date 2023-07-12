package Sort;

public class InsertSort {

    /*
     * Time complexity:
     * - Best: O(n)
     * - Worse:O(n^2)
     * - Average: O(n^2)
     * Space complexity: O(1)
     * Stabilization : stable
     * @param nums
     * */
    public static void insertSort(int[] nums){
        int temp;
        for(int i = 0; i<nums.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(nums[j] < nums[j-1]){
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }else {
                    break;
                }
            }
        }
    }
/*
    Bisection Method
     * Time complexity:
     * - Best: O(nlogn)
     * - Worse:O(n^2)
     * - Average: O(n^2)
 */
    public static void insertSortBinary(int[] nums){
        int high,low,temp,mid; // declare variable ahead.
        for (int i = 0; i < nums.length; i++) {
            high = i;
            low = 0;
            temp = nums[i + 1];

            while(low <= high){
                mid = (low + high) / 2;
                if(nums[mid] < temp){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
            for (int j = i; j < high; j--) {
                nums[j + 1] = nums[j];
            }
            nums[high + 1] = temp;
        }
    }
// example
    public static void main(String[] args) {
        Example examples = new Example();
        insertSort(examples.nums);
        insertSortBinary(examples.nums);
    }
}
