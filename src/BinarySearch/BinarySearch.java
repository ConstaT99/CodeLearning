package BinarySearch;

import Sort.Example;

import java.util.Arrays;

import static Sort.QuickSort.quickSort;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                start = mid + 1;
            }else if (nums[mid] > target){
                end = mid;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                start = mid + 1;
            }else if (nums[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch3(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                start = mid;
            }else if (nums[mid] > target){
                end = mid ;
            }
        }
        if(target == nums[start]){
            return start;
        }else if (target == nums[end]){
            return end;
        }
        return -1;
    }

    public static int binarySearch_recursive(int[] nums,int target, int left, int right){
        if(left >= right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(nums[mid] < target){
            return binarySearch_recursive(nums,target,mid + 1, left);
        }else if(nums[mid] > target){
            return binarySearch_recursive(nums,target,left,mid);
        }else {
            return mid;
        }
    }


    public static void main(String[] args) {
        Example myExample = new Example();
        int[] nums = myExample.Q300;
        quickSort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));
        int res = binarySearch2(nums,5);
        System.out.println(res);
        res = binarySearch3(nums,9);
        System.out.println(res);
        res = binarySearch_recursive(nums,1,0,nums.length);
        System.out.println(res);
    }
}
