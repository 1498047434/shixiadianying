package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 57. 和为 s 的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 * 示例 2：
 *
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/xzimqj/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer57 {

    //暴力：超时
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return null;
    }

    /**
     * 思路
     * 标签：双指针
     * 整体思路：
     *  因为数组本身是有序的，那么完全可以在数组的开头 start 和结尾 end 位置各设置一个指针，
     *  通过二者的加和 sum 来找到目标值 target，如果 sum < target，则 start++，
     *  这样可以让下一次的 sum 变大，如果 sum > target，则 end--，
     *  这样可以让下一次的 sum 变小，找到结果
     * 时间复杂度：O(n)，空间复杂度：O(1)
     */
    public int[] twoSum1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start < end){
            if (nums[start] + nums[end] < target){
                start ++;
            }else if (nums[start] + nums[end] > target){
                end--;
            }else {
                return new int[]{nums[start],nums[end]};
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(new Offer57().twoSum1(new int[]{2,7,11,15,},9));
    }
}
