package dz5;

public class task4 {
    
    public static void main(String[] args) {
        solveQueensProblem();
    }
    
    public static void solveQueensProblem() {
        int[][] board = new int[8][8];
        if (solveQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution found");
        }
    }
    
    public static boolean solveQueens(int[][] board, int col) {
        if (col == board.length) {
            return true;
        }
        
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                
                if (solveQueens(board, col + 1)) {
                    return true;
                }
                
                board[row][col] = 0;
            }
        }
        
        return false;
    }
    
    public static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
