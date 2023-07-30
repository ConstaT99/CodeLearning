package LeetCodeAns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q244 {
    HashMap<String, List<Integer>> wordsIndex;

    public Q244(String[] wordsDict) {
        wordsIndex = new HashMap<>();
        for(int i = 0; i < wordsDict.length; i++){
            if(wordsIndex.containsKey(wordsDict[i])){
                wordsIndex.get(wordsDict[i]).add(i);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                wordsIndex.put(wordsDict[i],list);
            }
        }

    }

    public int shortest(String word1, String word2) {
        List<Integer> idx1 = wordsIndex.get(word1);
        List<Integer> idx2 = wordsIndex.get(word2);
        int res = Integer.MAX_VALUE;
        for(int i : idx1){
            for(int j : idx2){
                res = Math.min(res, Math.abs(i - j));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] wordDict = new String[]{"practice","makes","perfect","coding","makes"};
        Q244 obj = new Q244(wordDict);
        int res = obj.shortest("coding", "practice");
        System.out.println(res);
    }
}
