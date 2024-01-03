package LeetCodeAns;

import java.util.ArrayList;
import java.util.List;

public class Q228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< nums.length; i ++){
            s = nums[i];
            sb.append(s);
            while((i + 1) < nums.length && nums[i] + 1 == nums[i + 1] )i ++;
            if(s != nums[i]){
                res.add(sb.append("->").append(nums[i]).toString());
            }else{
                res.add(sb.toString());
            }
            sb.setLength(0);
        }
        return res;
    }
}
