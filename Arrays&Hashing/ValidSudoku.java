public class ValidSudoku {
    public boolean isValidSudoku(char[][] board){
        for(int row = 0; row<9; row++) {
            for(int col = 0; col<9; col++) {
                if(board[row][col] == '.') {
                    if (!isSafe(row, col, board[row][col], board)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isSafe(int row, int col, char digit, char[][] sudoku) {
        for(int i = 0; i<9; i++) {
            if(i!= row && sudoku[i][col] == digit ){
                return false;
            }
        }

        for(int i = 0; i<9; i++) {
            if (i!=col && sudoku[row][i] == digit){
                return false;
            }
        }

        int subgridStartRow = 
    }
}
