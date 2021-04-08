package cn.edkso.sword_finger66.classifcation.dynamic_programming;

public class Offer62 {



    //F(1) = 0
    //F(2) = (F(1) + m) % 2
    //F(3) = (F(2) + m) % 3
    public int lastRemaining1(int n, int m) {
        int f = 0;
        for (int i = 2; i <= n; i++) {
            f = (f + m) % i;
        }
        return f;
    }

    //超时
    // 0 1 2 3 4
    // x   x
    public int lastRemaining(int n, int m) { // 5 ， 3
        int[] dp = new int[n];
        int res = -1;

        int left = 0;
        int right = m; //偏移量

        int count = 0; //删除的数量
        while (count < n){
            for (int i = left; i < right; i++) {
                if (dp[i%5] == -1){
                    right ++;
                }else if (i +1 == right){
                    dp[i%5] = -1;
                    res = i%5;
                }
            }
            left = right; //3
            right = right + m; //6
            count++;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = new Offer62().lastRemaining(5, 2);
        System.out.println(res);
    }
}
