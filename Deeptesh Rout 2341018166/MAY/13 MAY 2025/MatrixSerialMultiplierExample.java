import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class MatrixSerialMultiplierExample {

    public static void main(String[] args) {
        int[][] fM = gM(3, 3);
        int[][] sM = gM(3, 3);

        System.out.println("First Matrix:");
        printMatrix(fM);

        System.out.println("\nSecond Matrix:");
        printMatrix(sM);

        Date start = new Date();
        int[][] result = mm(fM, sM);
        Date end = new Date();

        System.out.println("\nResult Matrix:");
        printMatrix(result);

        System.out.println("\nTotal time is " + (end.getTime() - start.getTime()) + " ms");
    }

    public static int[][] mm(int[][] m1, int[][] m2) {
        int r1 = m1.length;
        int c1 = m1[0].length;
        int r2 = m2.length;
        int c2 = m2[0].length;

        if (c1 != r2) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }

        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                res[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }

    public static int[][] gM(int r, int c) {
        int[][] mat = new int[r][c];
        Random ran = new Random();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = ran.nextInt(10); // Values between 0-9
            }
        }
        return mat;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
