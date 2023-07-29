package LeetCodeAns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q347 {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        List<Integer>[] bucket = new List[(nums.length / k) + 2];

        for(int i : map.keySet()){
            int freq = map.get(i);
            if(bucket[freq - 1] == null){
                bucket[freq - 1] = new ArrayList<>();
            }
            bucket[freq - 1].add(i);
        }
        int idxk = 0;
        for(int i = bucket.length - 1; i >= 0 && idxk < k ; i --){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[idxk++] = num;
                    if(idxk == k){
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
