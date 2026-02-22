public class kKnights {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board=new boolean[n][n];
        count(board,0,0,n);
    }

    static void count(boolean[][] board, int row, int col, int knights) {

        if (knights == 0) {
            display(board);
            return;
        }
        if(row==board.length){
            return;
        }
        if (col == board[0].length) {
                count(board, row + 1, 0, knights);
                return;
        }
        if (isSafe(board, row, col)) {
            board[row][col]=true;
            count(board,row,col+1,knights-1);
            board[row][col]=false;
        }
        count(board,row,col+1,knights);
        return;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print((cell?"K":".")+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        int[][] moves={
            {row,col},
            {-2,1},{-2,-1},
            {2,1},{2,-1},
            {-1,2},{-1,-2},
            {1,2},{1,-2}
        };
        for(int[] move:moves){
            int r=row+move[0];
            int c=col+move[1];
            if(r>=0 && r<board.length && c>=0 && c<board[0].length){
                if(board[r][c]){
                    return false;
                }
            }
        }
        return true;
    }
}