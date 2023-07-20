package LeetCodeAns;

public class Q387 {
    /*
    * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
    Example 1:

    Input: s = "leetcode"
    Output: 0
    Example 2:

    Input: s = "loveleetcode"
    Output: 2
    Example 3:

    Input: s = "aabb"
    Output: -1
    *
    *
    *
    * */
    public static int firstUniqChar(String s) {
        if(s == null ) return -1;
        int[] count = new int[26];
        for( int i = 0; i < s.length(); i ++){
            count[s.charAt(i) - 'a']++;
        }
        for( int i = 0; i < s.length(); i++){
            if(count[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }


}
