package cn.edkso.sword_finger66.classifcation.dynamic_programming;

public class Offer47 {

    public int maxValue(int[][] grid) {
        return dynamic(grid,grid.length-1,grid[0].length -1);
    }

    //递归dp  ：超时
    public int dynamic(int[][] grid, int m, int n){
        if (m == 0 && n == 0){
            return grid[m][n];
        }
        if (m == 0){
            return grid[m][n] + dynamic(grid, m,n-1);
        }
        if (n == 0){
            return grid[m][n] + dynamic(grid, m-1,n);
        }
        return grid[m][n] + Math.max(dynamic(grid, m,n-1) ,dynamic(grid, m-1,n));
    }

    //dp ：非递归
    public int maxValue1(int[][] grid) {
        return dynamic(grid,grid);
    }

    public int dynamic(int[][] grid, int[][] dp){
        int row = grid.length;
        int colum = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (i == 0 && j ==0){
                    continue;
                }else if(i == 0) {
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                }else if(j == 0) {
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                }else{
                    dp[i][j] = grid[i][j] + Math.max( dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }


    public static void main(String[] args) {
        int res = new Offer47().maxValue1(new int[][]
                                                    {{1, 3, 1},
                                                     {1, 5, 1},
                                                     {4, 2, 1}});
//        int res = new Offer47().maxValue1(new int[][]
//                {{0}});
        System.out.println(res);
    }
}
