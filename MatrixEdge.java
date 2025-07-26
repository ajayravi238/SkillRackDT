import java.util.*;

public class MatrixEdge
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		char ch = sc.next().charAt(0);
		if(ch == 'T') {
		    for(int j=0; j<col; j++) {
		        System.out.print(arr[0][j] + " ");
		    }
		}
		else if(ch == 'R') {
		    for(int i=0; i<row; i++) {
		        System.out.print(arr[i][col-1] + " ");
		    }
		}
		else if(ch == 'B') {
		    for(int j=col-1; j>=0; j--) {
		        System.out.print(arr[row-1][j] + " ");
		    }
		}
		else {
		    for(int i=row-1; i>=0; i--) {
		        System.out.print(arr[i][0] + " ");
		    }
		}
	}
}
