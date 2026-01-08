import java.util.*;
public class VerticalAlignmentMiddleCharacter {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		int R = 0;
		for(int i=0; i<N; i++) {
		    if(arr[i].length() > R) {
		        R = arr[i].length();
		    }
		}
		char[][] res = new char[R][N];
		for(int i=0; i<R; i++) {
		    for(int j=0; j<N; j++) {
		        res[i][j] = '*';
		    }
		}
		for(int j=0; j<N; j++) {
		    int st = (R-arr[j].length()) / 2;
		    for(int i=0; i<R; i++) {
		        if(i<arr[j].length()) {
		            res[st+i][j] = arr[j].charAt(i);
		        }
    		}
		}
        for(int i=0; i<R; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
	}
}
