
import java.util.Arrays;
import java.util.Random;

public class MatrixSerialMultipliactionExampleWithTime {


	public static void main(String[] args) {
		int[][] fM=gM(3,3);
		int[][] sM=gM(3,3);;
		System.out.println(Arrays.deepToString(mm(fM,sM)));

	}

	public static int[][] mm(int[][] m1,int[][] m2){
		int r1=m1.length;
		int c1=m1[0].length;
		int c2=m2[0].length;
		int res[][] = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				res[i][j]=0;
				for (int k = 0; k < c1; k++) {
				res[i][j]+=m1[i][k]*m2[k][j];	
				}
			}
		}
		return res;
	}

	public static int[][] gM(int r, int c) {
		int [][] mat=new int[r][c];
		Random ran=new Random();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j]=ran.nextInt(10);
			}
		}
		return mat;
	}

}
