import java.util.*;
public class MatrixFoldDownRecursively {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] arr = new int[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		while(arr.length%2 == 0) {
		int[][] fold = new int[R/2][C];
		int z = 0;
		int mDec = (R/2)-1, mInc = (R/2);
		for(int i=mDec, k=mInc; i>=0 & k<R; i--, k++) {
		    int sum = 0;
		    for(int j=0; j<C; j++) {
		        sum = arr[i][j] + arr[k][j];
		        fold[z][j] = sum;
		    }
		    z++;
		}
		for(int i=0; i<R/2; i++) {
		    for(int j=0; j<C; j++) {
		        System.out.print(fold[i][j] + " ");
		    }
		    System.out.println();
		}
		arr = fold;
		R = arr.length;
		}
	}
}
