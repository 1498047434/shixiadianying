package cn.edkso.sword_finger66.JZ19;

import java.util.ArrayList;

/**
 * 《顺时针打印矩阵》
 *
 * 题目描述：
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，
 * 如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 示例1
 * 输入
 * [[1,2],[3,4]]
 *
 * 返回值
 * [1,2,4,3]
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList();

        int left = -1;
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        while (left < right && top <= bottom){
            left ++;
            for (int i = left; i <=right; i++) {
                res.add(matrix[top][i]);
            }

            top++;
            for (int i = top; i<= bottom; i++){
                res.add(matrix[i][right]);
            }

            if (bottom >= top){
                right--;
                for (int j = right; j >= left; j--){
                    res.add(matrix[bottom][j]);
                }
            }

            if (right >= left){
                bottom--;
                for (int j = bottom; j >= top; j--) {
                    res.add(matrix[j][left]);

                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new Solution().printMatrix(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}});
        ArrayList<Integer> integers1 = new Solution().printMatrix(new int[][]{{1,2},{3,4},{5,6},{7,8},{9,10}});
        System.out.println(integers);
        System.out.println(integers1);
    }
}
