package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 04. 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target=5，返回true。
 *
 * 给定target=20，返回false。
 *
 * 限制：
 *
 * 0 <= n <= 1000
 *
 * 0 <= m <= 1000
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/xs5w4d/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer04 {

    /**
     * 暴力
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 思路：从左下角出发，当前为cur = matrix[matrix.length][0]
     * 判断条件：
     *  cur=target，命中
     *  cur<target ，往右走
     *  cur>target ，往上走
     *
     * 结束条件：数组越界
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int i = matrix.length-1;
        int j = 0;
        int cur;
        while (i >=0 && j <= matrix[0].length - 1){

            cur = matrix[i][j];
            if (cur == target){
                return true;
            }else if (cur < target){
                j++;
            }else{
                i--;
            }

        }
        return false;
    }
}
