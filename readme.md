# Sudoku Completion Program README

## Overview

This Java program completes a partially filled 8x9 Sudoku grid by calculating the missing numbers in each row and column. It ensures that each row and column sums up to 45 (since the sum of the numbers 1 to 9 is 45).

## Files

- `MainSudoku.java`: Contains the `main` method to test the Sudoku completion logic.
- `Sudoku.java`: Contains the logic for completing the Sudoku grid.

## Usage

### Running the Program

1. **Compile the Java files**: 
    ```sh
    javac MainSudoku.java Sudoku.java
    ```

2. **Run the program**:
    ```sh
    java MainSudoku
    ```

### Input

The program currently has two predefined Sudoku grids, `a` and `b`, within the `main` method of `MainSudoku.java`. The grid `b` is passed to the `completeSudoku` method to be completed.

### Output

The completed Sudoku grid is printed to the console, with each row on a new line.

## Method Overview

### Sudoku.completeSudoku(int[][] a)

This method takes an 8x9 grid as input and completes it to a 9x9 grid by calculating the missing numbers in each row and column.

### Private Methods in Sudoku.java

- `fillColumn()`: Fills the last column of the grid.
- `fillRow()`: Fills the last row of the grid.

## Example

### Input

The input grid `b` used in the program:

```
6 8 2 7 9 3 1 5 0
7 1 4 2 6 5 8 9 0
5 9 3 8 4 1 2 6 0
1 6 7 3 2 4 5 8 0
2 4 9 5 7 8 6 3 0
3 5 8 9 1 6 7 4 0
8 2 1 6 3 9 4 7 0
9 7 5 4 8 2 3 1 0
```

### Output

The completed grid printed by the program:

```
6 8 2 7 9 3 1 5 4 
7 1 4 2 6 5 8 9 3 
5 9 3 8 4 1 2 6 7 
1 6 7 3 2 4 5 8 9 
2 4 9 5 7 8 6 3 1 
3 5 8 9 1 6 7 4 2 
8 2 1 6 3 9 4 7 5 
9 7 5 4 8 2 3 1 6 
4 3 6 1 5 7 9 2 8 
```
