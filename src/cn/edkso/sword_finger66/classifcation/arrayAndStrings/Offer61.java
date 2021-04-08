package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 * 示例1:
 * 输入: [1,2,3,4,5]
 * 输出: True
 *
 * 示例2:
 * 输入: [0,0,1,2,5]
 * 输出: True
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/e27dk2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer61 {


    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int cur = 0;
        int zeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zeros ++;
                continue;
            }else{
                if (cur == 0){
                    cur = nums[i];
                }else{
                    if (cur + 1 == nums[i]) {
                        cur = nums[i];
                    }else if (zeros > 0 && cur < nums[i]){
                        int count = 0;
                        while (true){
                            count ++;
                            zeros --;
                            if (cur + 1 + count == nums[i]){
                                break;
                            }
                        }
                        if (zeros < 0){
                            return false;
                        }else {
                            cur = nums[i];
                        }
                    }else{
                        return false;
                    }
                }
            }
        }

        return true;
    }


    public static boolean isStraigh1(int[] nums) {
        Arrays.sort(nums);

        int zeros = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0){
                zeros ++;
            }else if (nums[i] == nums[i+1]){
                return false;
            }
        }

        if (nums[nums.length-1] - nums[zeros] >= 5){
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isStraigh1(new int[]{13,13,9,12,10}));;
    }
}
