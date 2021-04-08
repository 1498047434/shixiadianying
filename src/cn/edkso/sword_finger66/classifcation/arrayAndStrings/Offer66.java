package cn.edkso.sword_finger66.classifcation.arrayAndStrings;

/**
 * 剑指 Offer 66. 构建乘积数组
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 * 示例:
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 *
 * 作者：画手大鹏
 * 链接：https://leetcode-cn.com/leetbook/read/illustrate-lcof/5wrns3/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer66 {

    //超时
    public int[] constructArr(int[] a) {

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = 1;
            for (int j = 0; j < a.length; j++) {
                if (i != j){
                    b[i] = b[i] * a[j];
                }
            }
        }

        return b;
    }


    //下三角
    public static int[] constructArr2(int[] a) {
        int[] b = new int[a.length];
        if (a.length >0){
            b[0] = 1;
        }


        int left = 1;
        for (int i = 0; i < a.length -1; i++) {
            left = left * a[i];
            b[i+1] = left;
        }


        int right = 1;
        for (int i = a.length-1; i > 0; i--) {
            right = right * a[i];
            b[i-1] = right * b[i-1];
        }

        return b;
    }

    public static void main(String[] args) {
        constructArr2(new int[]{1,2,3,4,5});
    }
}
