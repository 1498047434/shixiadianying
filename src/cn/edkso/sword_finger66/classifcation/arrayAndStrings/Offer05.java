package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/xz2cf5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer05 {
    /**
     * java类库
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }

    /**
     * 字符串遍历拼接
     */
    public String replaceSpace2(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt != ' '){
                sb.append(charAt);
            }else {
                sb.append("%20");
            }
        }

        return sb.toString();
    }
}
