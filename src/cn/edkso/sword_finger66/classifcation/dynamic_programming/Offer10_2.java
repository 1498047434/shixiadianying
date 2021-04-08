package cn.edkso.sword_finger66.classifcation.dynamic_programming;

public class Offer10_2 {

    public int numWays(int n) {
        int f1 = 0;
        int f2 = 1;

        int sum;
        for (int i = 0; i < n; i++) {
            sum = (f1 + f2) % 1000000007;
            f1 = f2;
            f2 = sum;
        }
        return f2;
    }
}
