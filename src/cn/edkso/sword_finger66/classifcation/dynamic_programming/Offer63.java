package cn.edkso.sword_finger66.classifcation.dynamic_programming;

/**
 * 剑指 Offer 63. 股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 *
 *
 * 示例 1:
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/5w5qjr/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer63 {

    //     [7,1,5,3,6,4]
    //base  7,1,1,1,1,1
    //max   0,0,4,4,5,3

    //     [7,6,4,3,1]
    //base  7,6,4,3,1
    //max   0,0,0,0,0
    public int maxProfit(int[] prices) {

        if (prices.length == 0){
            return 0;
        }
        int base = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < base){
                base = prices[i];
            }else{
                max = Math.max(max,prices[i] - base);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Offer63().maxProfit(new int[]{}));
        System.out.println(new Offer63().maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(new Offer63().maxProfit(new int[]{7,6,4,3,1}));
    }
}
