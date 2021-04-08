package cn.edkso.sword_finger66.classifcation.dynamic_programming;

public class Offer10_1 {


    public int fib1(int n) {
        int[] f = new int[2];
        f[0] = 0;
        f[1] = 1;
        int sum;
        for (int i = 0; i < n; i++) {
            sum = (f[0] + f[1]) % 1000000007;
            f[0] = f[1];
            f[1] = sum;
        }
        return f[0];
    }

    //int f0 = 0;
    //int f1 = 1;
    //  f2 = f0 + f1 = 1;
    //  f3 = f1 + f2 = 2;
    //递归 超时
    public int fib(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        int res = new Offer10_1().fib1(0);
        System.out.println(res);
    }
}
