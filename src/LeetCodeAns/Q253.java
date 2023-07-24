package LeetCodeAns;

import java.util.Arrays;

public class Q253 {

//    Given an array of meeting time intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
//
//
//
//            Example 1:
//
//    Input: intervals = [[0,30],[5,10],[15,20]]
//    Output: 2
//    Example 2:
//
//    Input: intervals = [[7,10],[2,4]]
//    Output: 1
    public int minMeetingRooms(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for( int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int endi = 0;
        int res = 0;
        for( int i = 0; i < intervals.length; i++){
            if(start[i] < end[endi]){
                res++;
            }else{
                endi++;
            }
        }
        return res;
    }
}
