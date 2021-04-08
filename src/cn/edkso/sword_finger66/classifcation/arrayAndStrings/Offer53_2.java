package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 53 - II. 0～n-1 中缺失的数字
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 *
 * 示例 1:
 *
 * 输入: [0,1,3]
 * 输出: 2
 * 示例2:
 *
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/e2dts5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

public class Offer53_2 {

    public int missingNumber(int[] nums) {


        int l = 0;
        int r = nums.length -1;
        while (l <= r){
            int mid = l + (r-l) /2;

            if (nums[mid] == mid){
                l = mid + 1;
            }else {
                r = mid -1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int res = new Offer53_2().missingNumber(new int[]{0,1,2,3,4,5,6,7,9});
        System.out.println(res);
    }
}
