package Sort;

public class MergeSort {
    /*
     * Time complexity:
     * - Best: O(nlogn)
     * - Worse:O(nlogn)
     * - Average: O(nlogn)
     * Space complexity: O(n)
     * Stabilization : stable
     * @param nums
     * */

    public static int[] mergeSort(int[] nums, int low, int high){
        int mid = (low + high) / 2;
        if( low < high){
            mergeSort(nums, low, mid);
            mergeSort(nums,mid + 1, high);
            merge(nums, low, mid , high);
        }
        return nums;
    }

    public static void merge(int[] nums, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while( i <= mid && j <= high){
            if(nums[i] < nums[j]){
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        // finish the rest of list
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= high){
            temp[k++] = nums[j++];
        }
        // copy the temp to nums
        System.arraycopy(temp, 0, nums, low, temp.length);
    }

    public static void main(String[] args) {
        Example examples = new Example();
        int[] nums = examples.nums;
        mergeSort(nums,0,nums.length - 1);
        for( int num: nums){
            System.out.println(num);
        }
    }
}
