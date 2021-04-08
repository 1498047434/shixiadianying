package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 67. 把字符串转换成整数
 * 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。
 *
 *  
 *
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 *
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 *
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 *
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 *
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 *
 * 说明：
 *
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 *
 * 示例1:
 * 输入: "42"
 * 输出: 42
 *
 * 示例2:
 * 输入: "   -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 *         我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 *
 * 示例3:
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 *
 * 示例4:
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 *      因此无法执行有效的转换。
 *
 * 示例5:
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
 *      因此返回 INT_MIN (−231) 。
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/e2im3i/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer67 {

    public static int strToInt(String str) {

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' && res.equals("")){
                continue;
            }else if ((c == '-' || c == '+' )&& res.equals("")){
                res = res + c;
            }else if (c >= '0' && c <= '9'){
                res = res + c;
            }else{
                break;
            }
        }

        Double resDouble = 0.0;
        try {
            resDouble = Double.valueOf(res);
            if (resDouble > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if (resDouble < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }catch (Exception e){
            return 0;
        }
        double d = 5.3e2;
        float f =11.1f;
        double d1 = 15.1D;
        double d2 =  d + f +d1;
        System.out.println(d2);
        return Integer.valueOf(res);
    }

    public static void main(String[] args) {
//        System.out.println(strToInt("42"));
//        System.out.println(strToInt(" -42"));
//        System.out.println(strToInt("4193 with words"));
//        System.out.println(strToInt("words and 987"));
//        System.out.println(strToInt(" words and 987"));
//        System.out.println(strToInt("-91283472332"));
//        System.out.println(strToInt("-"));
//        System.out.println(strToInt("+-2"));
//        System.out.println(strToInt("+1"));
//        System.out.println(strToInt("  +0 123"));
//        int res = strToInt("-5-");
//        System.out.println(res);
        List<String> listA = new ArrayList<String>();
        List<String> listB = new ArrayList<String>();
        listA.add("A");
        listA.add("B");
        listB.add("B");
        listB.add("C");
        boolean b = listA.retainAll(listB);
        System.out.println(listA);
    }
}
