package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

import java.util.Stack;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 * 
 *
 * 示例 1：
 *
 * 输入: "the sky is blue"
 * 输出:"blue is sky the"
 * 示例 2：
 *
 * 输入: " hello world! "
 * 输出:"world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 *
 * 输入: "a good  example"
 * 输出:"example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/59e6xm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer58_1 {

    //利用栈，时间复杂度o(n),空间复杂度o(n)
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                continue;
            }
            if (s.charAt(i) != ' '){
                String word = "" + s.charAt(i);

                i++;
                while (i < s.length() && s.charAt(i) != ' '){
                    word = word + s.charAt(i);
                    i++;
                }

                stack.push(word);
            }
        }

        String res = "";
        if (!stack.isEmpty()){
            res = stack.pop();
        }
        while (!stack.isEmpty()){
            res = res + " " + stack.pop();
        }

        return res;
    }

    //不使用栈,时间复杂度o(n),空间复杂度o(n)
    public String reverseWords1(String s) {

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                continue;
            }
            if (s.charAt(i) != ' '){
                String word = "" + s.charAt(i);

                i++;
                while (i < s.length() && s.charAt(i) != ' '){
                    word = word + s.charAt(i);
                    i++;
                }
                res = " " + word + res;
            }
        }
        return res.trim();
    }

    //双指针,时间复杂度o(n),空间复杂度o(n)
    public static String reverseWords2(String s) {

        s = s.trim();
        int start = s.length() -1;
        int end = s.length() -1;
        String res = "";

        while (start >= 0) {
            while (start >= 0 && s.charAt(start) != ' '){
                start --;
            }
            res  = res + s.substring(start+1, end+1) + " ";
            while (start >= 0 && s.charAt(start) == ' '){
                start --;
            }
            end = start;
        }
        return res.trim();
    }

    public static void main(String[] args) {
        reverseWords2("the sky is blue");
    }
}
