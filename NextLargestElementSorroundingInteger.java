import java.util.*;
public class NextLargestElementSorroundingInteger {

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
		int min = Integer.MAX_VALUE, row = -1, col = -1;
		for(int i=0; i<R; i++) {
		    for(int j=0; j<C; j++) {
		        if(arr[i][j] < min) {
		            min = arr[i][j];
		            row = i;
		            col = j;
		        }
		    }
		}
		ArrayList<Integer> seq = new ArrayList<>();
		seq.add(min);
		while(true) {
		    int nextValue = Integer.MAX_VALUE;
		    int nextRow = -1, nextCol = -1;
		    for(int i=-1; i<=1; i++) {
		        for(int j=-1; j<=1; j++) {
		            if(i == 0 && j == 0) {
		                continue;
		            }
		            int nr = row + i, nc = col + j;
		            if(nr >= 0 && nr < R && nc >= 0 && nc < C) {
		                int val = arr[nr][nc];
		                if(val > arr[row][col] && val < nextValue) {
		                    nextValue = val;
		                    nextRow = nr;
		                    nextCol = nc;
		                }
		            }
		        }
		    }
		    if(nextRow == -1) {
		        break;
		    }
		    seq.add(nextValue);
		    row = nextRow;
		    col = nextCol;
		}
		for(int i=0; i<seq.size(); i++) {
		    System.out.print(seq.get(i) + " ");
		}
	}
}
