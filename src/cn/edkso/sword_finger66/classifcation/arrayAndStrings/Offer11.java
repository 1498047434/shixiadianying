package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 *
 * 示例 1：
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/55wprc/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer11 {

    /**
     * 思想：
     * 初始化下标 left 和 right
     * 每次计算中间下标 mid = (right + left) / 2，这里的除法是取整运算，不能出现小数
     * 当 numbers[mid] < numbers[right] 时，说明最小值在 [left, mid] 区间中，则令 right = mid，用于下一轮计算
     * 当 numbers[mid] > numbers[right] 时，说明最小值在 [mid+1, right] 区间中，则令 left = mid + 1，用于下一轮计算
     * 当 numbers[mid] == numbers[right] 时，无法判断最小值在哪个区间之中，此时让 right--，缩小区间范围，在下一轮进行判断
     * 为什么是 right-- 缩小范围，而不是 left++？
     *      因为数组是升序的，所以最小值一定靠近左侧，而不是右侧
     *      *比如，当存在 [1,2,2,2,2] 这种情况时，left = 0，right = 4，mid = 2，数值满足 numbers[mid] == numbers[right] 这个条件，如果 left++，则找不到最小值
     *
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length -1;


        while (left < right){
            int mid = left + (right-left) /2;

            if (numbers[mid] < numbers[right]){ //说明最小值在 [left, mid] 区间中
                right = mid;

            }else if (numbers[mid] > numbers[right]){ //说明最小值在 [mid+1, right] 区间中
                left = mid + 1;

            }else { //numbers[mid] == numbers[right] 时,无法判断最小值在哪个区间之中，此时让 right--，缩小区间范围，在下一轮进行判断
                right --;
            }
        }

        return numbers[left];
    }

}
