package LeetCodeAns;

public class Q243 {

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int res = wordsDict.length;
        int a = -1;
        int b = -1;
        for( int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                a = i;
            }else if(wordsDict[i].equals(word2)){
                b = i;
            }
            if(a != -1 && b!= -1){
                res = Math.min(res, Math.abs(a - b));
            }
        }
        return res;
    }
}
