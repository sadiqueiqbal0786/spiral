package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];
        int count = 1;
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = columns - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Fill first row from left to right
            for (int i = colStart; i <= colEnd; i++) {
                result[rowStart][i] = count++;
            }
            rowStart++;
            // Fill last column from top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                result[i][colEnd] = count++;
            }
            colEnd--;
            // Fill last row from right to left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result[rowEnd][i] = count++;
                }
                rowEnd--;
            }
            // Fill first column from bottom to top
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result[i][colStart] = count++;
                }
                colStart++;
            }
        }
        return result;
    }
}
