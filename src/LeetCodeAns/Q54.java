package LeetCodeAns;

import Sort.Example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length ==0){
            return res;
        }
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin; i <= colEnd; i ++){
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i = rowBegin; i <=rowEnd; i ++){
                res.add(matrix[i][colEnd]);
            }
            colEnd --;

            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if(colBegin <= colEnd){
                for(int i = rowEnd; i >= rowBegin; i--){
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }
    public static void print(int rowBegin, int rowEnd, int colBegin, int colEnd){
        System.out.println(Integer.toString(rowBegin) + " " + Integer.toString(rowEnd) + " " + Integer.toString(colBegin) + " " + Integer.toString(colEnd));
    }
    public static void main(String[] args) {
        Example examples = new Example();
        int[][] matrix = examples.matrix;
        List<Integer> res = spiralOrder(matrix);
        System.out.println(res.toString());
    }

}
