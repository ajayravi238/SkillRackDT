import java.util.*;
public class AllSubMatricesSumFromTopLeft {

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
		int[][] res = new int[R][C];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        res[i][j] = arr[i][j];
		        
		        if(i > 0) {
		            res[i][j] += res[i-1][j];
		        }
		        if(j > 0) {
		            res[i][j] += res[i][j-1];
		        }
		        if((i > 0) && (j > 0)) {
		            res[i][j] -= res[i-1][j-1];
		        }
		    }
		}
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        System.out.print(res[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
