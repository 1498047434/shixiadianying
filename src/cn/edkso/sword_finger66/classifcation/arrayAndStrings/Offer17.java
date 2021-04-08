package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 17. 打印从 1 到最大的 n 位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 示例 1:
 *
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 *
 * 说明：
 *
 * 用返回一个整数列表来代替打印
 * n 为正整数
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/xzvgc2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer17 {
    public int[] printNumbers(int n) {

        int max = (int) Math.pow(10,n);
        int[]  arr = new int[max-1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
        }
        return arr;
    }

    public static void main(String[] args) {
        new Offer17().printNumbers(1);
    }
}
