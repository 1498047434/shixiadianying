package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 剑指 Offer 45. 把数组排成最小的数
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: "102"
 * 示例2:
 *
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/o5to5t/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer45 {

    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(String.valueOf(nums[i]));
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int res = (o1 + o2).compareTo(o2 + o1);
                return res;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        System.out.println(sb.toString());

        return sb.toString();
    }

    public static void main(String[] args) {
        new Offer45().minNumber(new int[]{3,30,34,5,9});
    }
}
