package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 剑指 Offer 39. 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *
 * 示例1:
 *
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/xz7dgg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer39 {

    /**
     * map： 时间复杂度o(n),
     *       空间复杂度o(n)
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }

        int max = 0;
        int curkey = 0;
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (value > max){
                curkey = key;
                max = value;
            }
        }

        return curkey;
    }

    /**
     * 最优解：摩尔投票 【最快】
     *  时间复杂度o(n)
     *  空间复杂度o(1)
     */
    public int majorityElement1(int[] nums) {

        int cur = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == cur){
                count ++;
            }else{
                count --;
                if (count == 0){
                    cur = nums[i];
                    count = 1;
                }
            }
        }
        return cur;
    }
}
