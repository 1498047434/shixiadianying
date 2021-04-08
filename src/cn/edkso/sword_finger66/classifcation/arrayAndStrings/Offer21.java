package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 * 示例：
 *
 * 输入：nums =[1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/xzdt4i/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer21 {

    //  nums =[1,2,3,4,5,6]
    //  nums =[1,2,3,4,5,6,7]

    /**
     * 思路：
     *  1. 弄一个辅助数组
     *  2. 遍历一遍原数组，把奇数放入辅助数组
     *  3. 再遍历一遍原数组，把偶数放入辅助数组
     * 时间复杂度o(n)
     * 空间复杂度o(n)
     * @param nums
     * @return
     */
    public int[] exchange(int[] nums) {

        int[] nums2 = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0){
                nums2[index++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                nums2[index++] = nums[i];
            }
        }
        return nums2;
    }

    /**
     * 思路：
     *  1. 弄两个指针，分别指向数组首部和尾部
     *  2. start = 0；           若，当前nums[start]是奇数，则start++；直到nums[start]是偶数
     *  3. end = nums.length-1； 若，当前end[start]是偶数， 则end--；  直到nums[end]是奇数
     *  4. 循环条件： start<end
     * 时间复杂度o(n)
     * 空间复杂度o(n)
     * @param nums
     * @return
     */
    public int[] exchange1(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start < end){
            while (nums[start] % 2 != 0 && start < end){
                start++;
            }
            while (nums[end] % 2 == 0 && start < end){
                end--;
            }
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(new Offer21().exchange1(new int[]{1,2,3,4,5}));
    }
}
