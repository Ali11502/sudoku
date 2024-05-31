public class Sudoku {
    private static int[][] n;

    private static void fillColumn() {
        for (int row = 0; row < 8; row++) {
            int sum = 0;
            for (int col = 0; col < 8; col++) {
                sum = sum + n[row][col];
            }
            n[row][8] = 45 - sum;
        }
    }

    private static void fillRow() {
        for (int col = 0; col < 9; col++) {
            int sum = 0;
            for (int row = 0; row < 8; row++) {
                sum = sum + n[row][col];
            }
            n[8][col] = 45 - sum;
        }
    }

    public static void completeSudoku(int[][] a) {
        int[][] temp2d = new int[9][9];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                temp2d[i][j] = a[i][j];
            }
        }
        n = temp2d;
        fillColumn();
        fillRow();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(n[row][col] + " ");
            }
            System.out.println();
        }
    }


}
/*int[][] temp2d = new int[9][9];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                temp2d[i][j] = n[i][j];
            }
        }
        n = temp2d;*/
