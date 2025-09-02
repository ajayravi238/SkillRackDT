import java.util.*;

public class SortRowAndColumn
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
		for(int i=0; i<row; i++) { // 0
			for(int j=0; j<col; j++) { // 0 1 2 3 4
				for(int k=0; k<col-1; k++) {
					if(arr[i][k] > arr[i][k+1]) {
						int temp = arr[i][k];
						arr[i][k] = arr[i][k+1];
						arr[i][k+1] = temp;
					}
				}
			}
		}
		for(int j=0; j<col; j++) {
			for(int i=0; i<row; i++) {
				for(int k=0; k<row-1; k++) {
					if(arr[k][j] > arr[k+1][j]) {
						int temp = arr[k][j];
						arr[k][j] = arr[k+1][j];
						arr[k+1][j] = temp;
					}
				}
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
