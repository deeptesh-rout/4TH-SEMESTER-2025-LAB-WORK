
// Question 4

import java.util.Arrays;

public class MatrixSerialMultipliactionExampleWithTimeMultiThread {
	public static void main(String[] args) {
		int[][] firstMatrix = generateMatrix(3, 3);
		int[][] secondMatrix = generateMatrix(3, 3);
		int[][] result = new int[3][3];
		Thread[] threads = new Thread[3];
		for (int i = 0; i < 3; i++) {
			final int row = i;
			threads[i] = new Thread(() -> {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						result[row][j] += firstMatrix[row][k] * secondMatrix[k][j];
					}
				}
			});
			threads[i].start();
		}
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		System.out.println(Arrays.deepToString(result));
	}

	public static int[][] generateMatrix(int rows, int columns) {
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}
		return matrix;
	}
}