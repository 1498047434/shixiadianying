package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的次数。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/5yt2c7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer53 {

    /**
     * 时间复杂度o(n)
     * 空间复杂度o(1)
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                sum++;
            }
        }
        return sum;
    }

    /**
     * 思想： 二分
     *
     * [l....mid]
     *
     * @param nums
     * @param target
     * @return
     */
    public int search1(int[] nums, int target) {
        int sum = 0;

        int l = 0;
        int r = nums.length - 1;
        int mid = l + (r-l) / 2;

        while (l <= r){
            if (nums[mid] > target){
                r = mid - 1;
            }else if (nums[mid] < target){
                l = mid + 1;
            }else{
                sum ++;

                int lmid = mid - 1;
                int rmid = mid + 1;
                while (lmid >= 0 && nums[lmid] == target){
                    sum ++;
                    lmid--;
                }
                while (rmid <= nums.length-1 && nums[rmid] == target){
                    sum ++;
                    rmid ++;
                }
                break;
            }
            mid = l + (r-l) / 2;
        }
        return sum;
    }


}
