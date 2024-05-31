public class MainSudoku {
    public static void main(String[] args) {
        int[][] a = {{5, 3, 4, 6, 7, 8, 9, 1},
                {6, 7, 2, 1, 9, 5, 3, 4},
                {1, 9, 8, 3, 4, 2, 5, 6},
                {8, 5, 9, 7, 6, 1, 4, 2},
                {4, 2, 6, 8, 5, 3, 7, 9},
                {7, 1, 3, 9, 2, 4, 8, 5},
                {9, 6, 1, 5, 3, 7, 2, 8},
                {2, 8, 7, 4, 1, 9, 6, 3}};
        int[][] b = {{6, 8, 2, 7, 9, 3, 1, 5},
                {7, 1, 4, 2, 6, 5, 8, 9},
                {5, 9, 3, 8, 4, 1, 2, 6},
                {1, 6, 7, 3, 2, 4, 5, 8},
                {2, 4, 9, 5, 7, 8, 6, 3},
                {3, 5, 8, 9, 1, 6, 7, 4},
                {8, 2, 1, 6, 3, 9, 4, 7},
                {9, 7, 5, 4, 8, 2, 3, 1}};
        Sudoku.completeSudoku(b);
    }
}