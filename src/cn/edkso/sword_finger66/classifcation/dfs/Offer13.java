package cn.edkso.sword_finger66.classifcation.dfs;

public class Offer13 {

    public int movingCount(int m, int n, int k) {
        return dfs(new int[m][n],m,n,0,0,k);
    }

    public int dfs(int[][] arr, int m, int n, int i, int j, int k){
        if (i < 0 || i > m-1 || j <0 || j > n-1
                || arr[i][j] == -1
                || i /10 + i % 10 + j / 10 + j % 10 > k){

            return 0;
        }

        arr[i][j] = -1;
        return 1 +
                dfs(arr,m,n,i+1,j,k) +
                dfs(arr,m,n,i,j+1,k);
    }

    //输入：m = 2, n = 3, k = 1
    //输出：3
    public static void main(String[] args) {
        int sum = new Offer13().movingCount(8, 11, 16);
        System.out.println(sum);
    }
}
