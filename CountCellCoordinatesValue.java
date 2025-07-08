import java.util.*;
public class CountCellCoordinatesValue {

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
		int count = 0;
		for(int i=0; i<row; i++) {
		    for(int j=0; j<col; j++) {
		        if(arr[i][j] >= 1 && arr[i][j] <= 9999 && getFirstDigit(arr[i][j]) == i+1) {
		            count++;
		        }
		    }
		}
		System.out.println(count);
	}
	public static int getFirstDigit(int n) {
	    while(n >= 10) {
	        n /= 10;
	    }
	    return n;
	}
}
