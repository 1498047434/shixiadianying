package cn.edkso.sword_finger66.JZ13;


/**
 * 《调整数组顺序，使奇数位于偶数前面》
 *
 * 题目描述：
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * 示例1
 * 输入
 * [1,2,3,4]
 *
 * 返回值
 * [1,3,2,4]
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */

    /**
     * 核心思想： k记录[0....k] 都是奇数
     *          i找到下一个奇数
     *          j = i；
     *
     *          [k....j-1,j]的元素从后往前依次交换
     *          [0.....,k=k+1] 又都是奇数了
     * @param array
     * @return
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        int k = 0;
        int j = 0;
        for (int i = 0; i < array.length;i++) {
            if (array[i] % 2 != 0){
                for (j = i; j > k; j--) {
                    swapInt(array,j-1,j);
                }
                k++;
            }
        }
        return array;
    }


    public static void swapInt(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        new Solution().reOrderArray(new int[]{1,2,3,4,5,6,7});
    }
}
