package cn.edkso.sword_finger66.classifcation.dfs;

public class Offer12 {

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,i,j,words,0)){
                    return true;
                }
            }
        }

        return false;
    }

    //ij（矩阵坐标） , k（word索引）
    private boolean dfs(char[][] board, int i, int j, char[] words, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
            || board[i][j] != words[k]){
            return false;
        }
        if (k == words.length -1){
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board,i+1,j,words,k+1) ||
                dfs(board,i,j+1,words,k+1)||
                dfs(board,i-1,j,words,k+1)||
                dfs(board,i,j-1,words,k+1);
        board[i][j] = temp;
        return res;
    }
}
