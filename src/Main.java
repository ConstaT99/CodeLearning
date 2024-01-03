import Sort.Example;

import javax.crypto.ExemptionMechanism;
import java.util.Arrays;

import static Sort.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {
        Example myExample = new Example();
        int[] nums = myExample.nums;
        quickSort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}