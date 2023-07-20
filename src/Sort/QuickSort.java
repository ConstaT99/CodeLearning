package Sort;

public class QuickSort {
    public static void quickSort(int[] nums, int left, int right){
        if(left < right){
            int pivot = partition(nums, left, right);
            quickSort(nums,left,pivot - 1);
            quickSort(nums,pivot+ 1, right);
        }
    }
    // partition function to find the pivot and swap the value.
    public static int partition(int[] nums, int left, int right){
        int pivot = nums[left];
        int l = left + 1;
        int r = right;
        while(l <= r){
            if(nums[l] > pivot && nums[r] < pivot){
                swap(nums,l++,r--);
            }
            if(nums[l] <= pivot) l++;
            if(nums[r] >= pivot) r--;
        }
        swap(nums,left,r);
        return r;
    }

    public static void swap(int[]nums, int l , int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        Example examples = new Example();
        int[] nums = examples.nums;
        quickSort(nums,0,nums.length - 1);
        for(int num : nums){
            System.out.println(num);
        }

    }
}
