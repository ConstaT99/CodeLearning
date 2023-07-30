package LeetCodeAns;

public class Q245 {
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        int res = wordsDict.length;
        int a = -1;
        for(int i= 0; i < wordsDict.length; i ++){
            if(wordsDict[i].equals(word1) || wordsDict[i].equals(word2)){
                if(a != -1 && (!wordsDict[a].equals(wordsDict[i]) || word1.equals(word2))){
                    res = Math.min(res, Math.abs(a - i));
                }
                a = i;
            }
        }
        return res;
    }
}
