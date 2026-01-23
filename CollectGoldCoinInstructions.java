import java.util.*;
public class CollectGoldCoinInstructions {

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
		sc.nextLine();
		String str = sc.nextLine();
		int[][] grid = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				grid[i][j] = arr[i][j];
			}
		}
		boolean[][] visited = new boolean[row][col];
		int sum = arr[0][0], R = 0, C = 0;
		arr[0][0] = 0;
		visited[0][0] = true;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'E') {
				C++;
			}
			else if(str.charAt(i) == 'W') {
				C--;
			}
			else if(str.charAt(i) == 'N') {
				R--;
			}
			else if(str.charAt(i) == 'S') {
				R++;
			}
			if(!visited[R][C]) {
				sum += arr[R][C];
				arr[R][C] = 0;
				visited[R][C] = true;
			}
			else {
				if(grid[R][C] > 0) {
					grid[R][C]--;
					sum -= 1;
				}
			}
		}
		System.out.println(sum);
	}
}
