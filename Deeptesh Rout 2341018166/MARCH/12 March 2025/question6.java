import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input matrices
            System.out.print("Enter rows and columns for matrices: ");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];

            System.out.println("Enter elements of Matrix 1:");
            inputMatrix(scanner, matrix1);

            System.out.println("Enter elements of Matrix 2:");
            inputMatrix(scanner, matrix2);

            // Perform operations
            System.out.println("Matrix 1:");
            displayMatrix(matrix1);

            System.out.println("Matrix 2:");
            displayMatrix(matrix2);

            // Addition
            System.out.println("Matrix Addition:");
            displayMatrix(addMatrices(matrix1, matrix2));

            // Multiplication (Ensuring valid dimensions)
            System.out.print("Enter columns for multiplication matrix: ");
            int mulCols = scanner.nextInt();
            int[][] matrix3 = new int[cols][mulCols];

            System.out.println("Enter elements of Matrix 3 (for multiplication):");
            inputMatrix(scanner, matrix3);

            System.out.println("Matrix Multiplication:");
            displayMatrix(multiplyMatrices(matrix1, matrix3));

            // Transpose
            System.out.println("Transpose of Matrix 1:");
            displayMatrix(transposeMatrix(matrix1));

            // Intentional out-of-bounds access for testing exception handling
            System.out.println("Attempting to access an invalid matrix index...");
            System.out.println(matrix1[rows][cols]); // This will cause an exception

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds! Please check matrix dimensions.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to take matrix input
    public static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method for matrix addition
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method for matrix multiplication
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method for matrix transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
