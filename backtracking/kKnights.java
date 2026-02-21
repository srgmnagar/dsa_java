public class kKnights {
    public static void main(String[] args) {
        
    }

    static void count(boolean[][] board, int row, int col, int knights) {

        if (knights == 0) {
            display(board);
        }
        if(row==board.length){
            return;
        }
        if (col == board[0].length) {
                count(board, row + 1, 0, knights);
            }
        if (isSafe(board, row, col)) {
            count(board,row,col+1,knights-1);
        }
        count(board,row,col+1,knights);
        return;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        return true;
    }
}