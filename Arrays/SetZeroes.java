

public class SetZeroes {

    public void setZeroes(int[][] matrix) {
        boolean isFirstRow = false;
        boolean isFirstCol = false;

        int m = matrix.length;
        int n = matrix[0].length;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                isFirstRow = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                isFirstCol = true;
                break;
            }
        }

        // Use first row and first column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set matrix cells to zero using markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Handle first row
        if (isFirstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Handle first column
        if (isFirstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        SetZeroes sol = new SetZeroes();

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        sol.setZeroes(matrix);

        // Print result
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
