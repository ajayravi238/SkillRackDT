import java.util.*;
public class MatrixRemoveDigits {

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
		int[][] resArr = new int[R][C];
		for(int j=0; j<C; j++) {
		    int min = Integer.MAX_VALUE;
		    for(int i=0; i<R; i++) {
		        if(min > arr[i][j]) {
		            min = arr[i][j];
		        }
		    }
		    generateArr(min, arr, j, R, C, resArr);
		}
		int s = 0;
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        System.out.print(resArr[i][j] + " ");
		        s += resArr[i][j];
		    }
		    System.out.println();
		}
		System.out.println(s);
	}
	
	public static int[][] generateArr(int min, int[][] arr, int c, int R, int C, int[][] resArr) {
	    String m = String.valueOf(min);
	    int len = m.length();
	    for(int i=0; i<R; i++) {
	        String a = String.valueOf(arr[i][c]);
	        String res = a.substring(0, len);
	        resArr[i][c] = Integer.parseInt(res);
	    }
	   return resArr;
	}
}
